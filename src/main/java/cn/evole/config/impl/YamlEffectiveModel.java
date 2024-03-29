/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.impl;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.Deque;

public class YamlEffectiveModel {
    private Deque<String> keys = new ArrayDeque<>();

    @Setter
    @Getter
    private long currentIndent;

    public String getCurrentPath() {
        return String.join(".", this.keys);
    }

    public String toKey(String line) {
        return line.split(":")[0].trim();
    }

    public long getIndent(String line) {
        int indent = 0;

        for (char c : line.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                return indent;
            }

            indent++;
        }

        return indent;
    }

    public int size() {
        return this.keys.size();
    }

    public boolean isKey(String line) {
        return line.contains(":");
    }

    public void addKey(String key) {
        this.keys.addLast(key);
    }

    public void replaceCurrentKey(String newKey) {
        this.keys.removeLast();
        this.keys.addLast(newKey);
    }

    public void removeKeys(long amount) {
        for (int i = 0; i < amount; i++) {
            this.keys.removeLast();
        }
    }
}