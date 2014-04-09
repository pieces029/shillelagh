package shillelagh;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.SOURCE;
import static shillelagh.SqliteType.NULL;

/**
 * All Database fields must be marked with this annotation.  This is to allow member variables,
 * makes it more explicit and makes it easier for processing
 */
@Retention(SOURCE)
@Target(FIELD)
public @interface Field {

    /**
     * The name of the column in the database. If not set then the name is taken from the field
     * name.
     */
    String columnName() default "";
}
