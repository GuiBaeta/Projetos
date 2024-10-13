package anotacao;

import java.lang.annotation.*;

/**
 * @author GuilhermeBaeta
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
