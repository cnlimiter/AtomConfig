/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.impl;

import cn.evole.config.api.IConfigDataManager;
import cn.evole.config.data.base.*;
import cn.evole.config.data.list.*;
import cn.evole.config.data.map.ConfigDataMapEnum;
import cn.evole.config.data.map.ConfigDataMapInteger;
import cn.evole.config.data.map.ConfigDataMapString;
import cn.evole.config.data.types.AbstractConfigData;
import cn.evole.config.data.types.ConfigDataType;
import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class ConfigDataManager
        implements IConfigDataManager {
    private static final ConfigDataList LIST = new ConfigDataList();
    private static final ConfigDataMapString MAP = new ConfigDataMapString();

    private static volatile ConfigDataManager instance;
    private final List<AbstractConfigData<?>> configurationDataList = Lists.newArrayList
            (
                    // base primitive objects

                    new ConfigDataBoolean(),
                    new ConfigDataDouble(),
                    new ConfigDataEnum<>(),
                    new ConfigDataInteger(),
                    new ConfigDataLong(),
                    new ConfigDataObject(),
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

    public static ConfigDataManager getInstance() {
        if (instance == null) {
            synchronized (ConfigDataManager.class) {
                if (instance == null) {
                    instance = new ConfigDataManager();
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
    public Optional<AbstractConfigData<?>> getType(Field field) {
        Class<?> fieldType = field.getType();

        Optional<AbstractConfigData<?>> optionalConfigurationData = this.getType(ConfigDataType.OBJECT, fieldType);

        if (List.class.isAssignableFrom(fieldType)) {
            Type fieldGenericType = field.getGenericType();

            if (fieldGenericType instanceof ParameterizedType) {
                Type typeArgument = ((ParameterizedType) fieldGenericType).getActualTypeArguments()[0];

                optionalConfigurationData = this.getType(ConfigDataType.LIST, (Class<?>) typeArgument);

                return optionalConfigurationData.isPresent() ? optionalConfigurationData : Optional.of(LIST);
            }
        }

        if (Map.class.isAssignableFrom(fieldType)) {
            Type fieldGenericType = field.getGenericType();

            if (fieldGenericType instanceof ParameterizedType) {
                Type typeArgument = ((ParameterizedType) fieldGenericType).getActualTypeArguments()[0];

                optionalConfigurationData = this.getType(ConfigDataType.MAP, (Class<?>) typeArgument);

                return optionalConfigurationData.isPresent() ? optionalConfigurationData : Optional.of(MAP);
            }
        }

        return optionalConfigurationData;
    }

    @Override
    public Optional<AbstractConfigData<?>> getType(Class<?> clazz) {
        return this.configurationDataList.stream()
                .filter((configurationData) ->
                        Stream.of(configurationData.getTypeClasses())
                                .anyMatch((typeClass) -> typeClass.isAssignableFrom(clazz))).findFirst();
    }

    protected Optional<AbstractConfigData<?>> getType(ConfigDataType dataType, Class<?> clazz) {
        return this.configurationDataList.stream()
                .filter((configurationData) -> configurationData.getType() == dataType)
                .filter((configurationData) ->
                {
                    return Stream.of(configurationData.getTypeClasses())
                            .anyMatch((typeClass) -> typeClass.isAssignableFrom(clazz));
                }).findFirst();
    }
}