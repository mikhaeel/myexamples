package info.everybodylies.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Formattable;
import java.util.Formatter;

class DosAttributesFormat implements Formattable {

    private DosFileAttributes fileAttributes;

    DosAttributesFormat(Path path) {
        try {
            fileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        formatter.format("[directory: %s, readonly: %s, archive: %s, system: %s]",
                fileAttributes.isDirectory(), fileAttributes.isReadOnly(), fileAttributes.isArchive(), fileAttributes.isArchive());
    }
}
