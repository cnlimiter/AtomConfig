/**
 * Author cnlimiter
 * CreateTime 2023/6/8 1:42
 * Name AtomConfig
 * Description
 */
package cn.evole.config.bukkit.file;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.Files;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;
import cn.evole.config.bukkit.Configuration;
import cn.evole.config.bukkit.InvalidConfigurationException;
import cn.evole.config.bukkit.MemoryConfiguration;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class FileConfiguration
        extends MemoryConfiguration {
    @Deprecated
    public static final boolean UTF8_OVERRIDE;

    @Deprecated
    public static final boolean UTF_BIG;

    @Deprecated
    public static final boolean SYSTEM_UTF;

    static {
        final byte[] testBytes = Base64Coder.decode("ICEiIyQlJicoKSorLC0uLzAxMjM0NTY3ODk6Ozw9Pj9AQUJDREVGR0hJSktMTU5PUFFSU1RVVldYWVpbXF1eX2BhYmNkZWZnaGlqa2xtbm9wcXJzdHV2d3h5ent8fX4NCg==");
        final String testString = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\r\n";
        final Charset defaultCharset = Charset.defaultCharset();
        final String resultString = new String(testBytes, defaultCharset);
        final boolean trueUTF = defaultCharset.name().contains("UTF");
        UTF8_OVERRIDE = !testString.equals(resultString) || defaultCharset.equals(StandardCharsets.US_ASCII);
        SYSTEM_UTF = trueUTF || UTF8_OVERRIDE;
        UTF_BIG = trueUTF && UTF8_OVERRIDE;
    }

    public FileConfiguration() {
        super();
    }

    public FileConfiguration(Configuration defaults) {
        super(defaults);
    }

    public void save(File file) throws IOException {
        Preconditions.checkNotNull(file, "File cannot be null");

        Files.createParentDirs(file);

        String data = this.saveToString();

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(file), UTF8_OVERRIDE && !UTF_BIG ? Charsets.UTF_8 : Charset.defaultCharset())) {
            writer.write(data);
        }
    }

    public void save(String file) throws IOException {
        Preconditions.checkNotNull(file, "File cannot be null");

        this.save(new File(file));
    }

    public abstract String saveToString();

    public void load(File file) throws FileNotFoundException, IOException, InvalidConfigurationException {
        Preconditions.checkNotNull(file, "File cannot be null");

        final FileInputStream stream = new FileInputStream(file);

        this.load(new InputStreamReader(stream, UTF8_OVERRIDE && !UTF_BIG ? Charsets.UTF_8 : Charset.defaultCharset()));
    }

    @Deprecated
    public void load(InputStream stream) throws IOException, InvalidConfigurationException {
        Preconditions.checkNotNull(stream, "Stream cannot be null");

        this.load(new InputStreamReader(stream, UTF8_OVERRIDE ? Charsets.UTF_8 : Charset.defaultCharset()));
    }

    public void load(Reader reader) throws IOException, InvalidConfigurationException {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader input = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader)) {
            String line;

            while ((line = input.readLine()) != null) {
                builder.append(line);
                builder.append('\n');
            }
        }

        this.loadFromString(builder.toString());
    }

    public void load(String file) throws IOException, InvalidConfigurationException {
        Preconditions.checkNotNull(file, "File cannot be null");

        this.load(new File(file));
    }

    public abstract void loadFromString(String contents) throws InvalidConfigurationException;

    protected abstract String buildHeader();

    @Override
    public FileConfigurationOptions options() {
        if (this.options == null) {
            this.options = new FileConfigurationOptions(this);
        }

        return (FileConfigurationOptions) this.options;
    }
}