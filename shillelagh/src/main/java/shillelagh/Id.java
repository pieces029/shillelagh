package shillelagh;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/** Declare a field to be the database ID column. This MUST be placed on a long. */
@Retention(SOURCE) @Target(FIELD)
public @interface Id {
}
