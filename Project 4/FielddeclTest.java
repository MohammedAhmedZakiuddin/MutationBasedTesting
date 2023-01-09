import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FielddeclTest {

    // Test ID 38
    @Test
    void toStringID38Test()
    {
        String type = "int";
        String id = "1";
        Expr opex = new Expr(1);
        boolean isFinal = true;

        Fielddecl fielddecl = new Fielddecl(type,id,opex,isFinal);
        String s = fielddecl.toString(0);
        String b = fielddecl.toStringID38(0);

        assertFalse(s==b);

    }

    // Test ID 39
    @Test
    void toStringID39Test()
    {
       String type = "int";
       String id = "value";
       int len = 3;

       Fielddecl fielddecl = new Fielddecl(type,id,len);
       String s = fielddecl.toString(0);
       String b = fielddecl.toStringID39(0);

       assertFalse(s==b);
    }


}