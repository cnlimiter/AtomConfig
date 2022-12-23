package cn.evolvefield.config.base.impl.memory;

import cn.evolvefield.config.base.api.ConfigurationSection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * Project: atomlib
 * Author: cnlimiter
 * Date: 2022/12/21 13:28
 * Description:
 */
public class SectionPathData {
    private Object data;
    private List<String> comments;
    private List<String> inlineComments;

    public SectionPathData(@Nullable Object data) {
        this.data = data;
        comments = Collections.emptyList();
        inlineComments = Collections.emptyList();
    }

    @Nullable
    public Object getData() {
        return data;
    }

    public void setData(@Nullable final Object data) {
        this.data = data;
    }

    /**
     * 如果不存在注释，将返回一个空列表。列表中的空条目表示空行，空字符串表示空注释行。
     *
     * @return 请求注释的不可修改列表，每个条目代表一行。
     */
    @NotNull
    public List<String> getComments() {
        return comments;
    }

    /**
     * 表示对 {@link ConfigurationSection} 的注释.
     * <p>
     * 代表条目的 ConfigurationSection 注释。列表中的空条目是空行，空字符串条目是空注释行。无论新评论是什么，任何现有评论都将被替换。
     *
     * @param comments 设置每个条目的新注释表示一行。
     */
    public void setComments(@Nullable final List<String> comments) {
        this.comments = (comments == null) ? Collections.emptyList() : Collections.unmodifiableList(comments);
    }

    /**
     * 如果不存在注释，将返回一个空列表。列表中的空条目表示空行，空字符串表示空注释行。
     *
     * @return 请求注释的不可修改列表，每个条目代表一行。
     */
    @NotNull
    public List<String> getInlineComments() {
        return inlineComments;
    }

    /**
     * 表示对 {@link ConfigurationSection} 的注释.
     * <p>
     * 列表中的空条目是空行，空字符串条目是空注释行。无论新注释内容是什么，任何现有注释内容都将被替换。
     *
     * @param inlineComments 设置每个条目的新注释表示一行。
     */
    public void setInlineComments(@Nullable final List<String> inlineComments) {
        this.inlineComments = (inlineComments == null) ? Collections.emptyList() : Collections.unmodifiableList(inlineComments);
    }
}
