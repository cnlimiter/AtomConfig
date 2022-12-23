package cn.evolvefield.config.impl.handler;

import cn.evolvefield.config.api.handler.IConfigDataHandler;
import cn.evolvefield.config.data.base.*;
import cn.evolvefield.config.data.list.*;
import cn.evolvefield.config.data.map.ConfigDataMapEnum;
import cn.evolvefield.config.data.map.ConfigDataMapInteger;
import cn.evolvefield.config.data.map.ConfigDataMapString;
import cn.evolvefield.config.data.types.AbstractConfigData;
import cn.evolvefield.config.data.types.ConfigurationDataType;
import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Project: AtomConfig
 * Author: cnlimiter
 * Date: 2022/12/23 18:29
 * Description:
 */
public class ConfigDataHandler implements IConfigDataHandler {
    private static final ConfigDataList LIST = new ConfigDataList();
    private static final ConfigDataMapString MAP = new ConfigDataMapString();
    private static volatile ConfigDataHandler instance;
    private final List<AbstractConfigData> configurationDataList = Lists.newArrayList
            (
                    // base primitive objects

                    new ConfigDataBoolean(),
                    new ConfigDataByte(),
                    new ConfigDataCharacter(),
                    new ConfigDataDouble(),
                    new ConfigDataEnum<>(),
                    new ConfigDataFloat(),
                    new ConfigDataInteger(),
                    new ConfigDataLong(),
                    new ConfigDataObject(),
                    new ConfigDataShort(),
                    new ConfigDataString(),

                    // objects in list

                    new ConfigDataListBoolean(),
                    new ConfigDataListByte(),
                    new ConfigDataListByte(),
                    new ConfigDataListCharacter(),
                    new ConfigDataListDouble(),
                    new ConfigDataListEnum<>(),
                    new ConfigDataListFloat(),
                    new ConfigDataListInteger(),
                    new ConfigDataListLong(),
                    new ConfigDataListMap(),
                    new ConfigDataListShort(),
                    new ConfigDataListString(),
                    LIST,

                    new ConfigDataMapEnum<>(),
                    new ConfigDataMapInteger(),
                    new ConfigDataMapString(),
                    MAP
            );

    public static ConfigDataHandler getInstance() {
        if (instance == null) {
            synchronized (ConfigDataHandler.class) {
                if (instance == null) {
                    instance = new ConfigDataHandler();
                }
            }
        }

        return instance;
    }

    @Override
    public void register(AbstractConfigData<?> configurationData) {
        this.configurationDataList.add(configurationData);
    }

    @Override
    public void remove(AbstractConfigData<?> configurationData) {
        this.configurationDataList.remove(configurationData);
    }

    @Override
    public Optional<AbstractConfigData> getType(Field field) {
        Class<?> fieldType = field.getType();

        Optional<AbstractConfigData> optionalConfigurationData = this.getType(ConfigurationDataType.OBJECT, fieldType);

        if (List.class.isAssignableFrom(fieldType)) {
            Type fieldGenericType = field.getGenericType();

            if (fieldGenericType instanceof ParameterizedType) {
                Type typeArgument = ((ParameterizedType) fieldGenericType).getActualTypeArguments()[0];

                optionalConfigurationData = this.getType(ConfigurationDataType.LIST, (Class<?>) typeArgument);

                return optionalConfigurationData.isPresent() ? optionalConfigurationData : Optional.of(LIST);
            }
        }

        if (Map.class.isAssignableFrom(fieldType)) {
            Type fieldGenericType = field.getGenericType();

            if (fieldGenericType instanceof ParameterizedType) {
                Type typeArgument = ((ParameterizedType) fieldGenericType).getActualTypeArguments()[0];

                optionalConfigurationData = this.getType(ConfigurationDataType.MAP, (Class<?>) typeArgument);

                return optionalConfigurationData.isPresent() ? optionalConfigurationData : Optional.of(MAP);
            }
        }

        return optionalConfigurationData;
    }

    @Override
    public Optional<AbstractConfigData> getType(Class<?> clazz) {
        return this.configurationDataList.stream()
                .filter((configurationData) ->
                {
                    return Stream.of(configurationData.getTypeClasses())
                            .anyMatch((typeClass) -> typeClass.isAssignableFrom(clazz));
                }).findFirst();
    }

    protected Optional<AbstractConfigData> getType(ConfigurationDataType dataType, Class<?> clazz) {
        return this.configurationDataList.stream()
                .filter((configurationData) -> configurationData.getType() == dataType)
                .filter((configurationData) ->
                        Stream.of(configurationData.getTypeClasses())
                                .anyMatch((typeClass) -> typeClass.isAssignableFrom(clazz))).findFirst();
    }
}
