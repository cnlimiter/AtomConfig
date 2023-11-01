/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.data.list;

import cn.evole.config.data.types.AbstractConfigDataList;
import cn.evole.config.yaml.file.FileConfiguration;
import lombok.EqualsAndHashCode;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
public class ConfigDataListEnum<E extends Enum<E>>
        extends AbstractConfigDataList<E> {
    public ConfigDataListEnum() {
        super(Enum.class);
    }

    @Override
    public void set(FileConfiguration configuration, String path, List<E> values, Field field) {
        configuration.set(path, values.stream()
                .map(Enum::name)
                .collect(Collectors.toList()));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<E> get(FileConfiguration configuration, String path, Field field) {
        if (!configuration.isSet(path)) {
            return null;
        }

        List<E> enums = new ArrayList<>();
        List<String> list = configuration.getStringList(path);

        for (String element : list) {
            try {
                enums.add(Enum.valueOf(((Class<E>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]), element));
            } catch (IllegalArgumentException e) {
                logger.warning("Can't get enum from string list: " + path);
                e.printStackTrace();
            }
        }

        return enums;
    }
}