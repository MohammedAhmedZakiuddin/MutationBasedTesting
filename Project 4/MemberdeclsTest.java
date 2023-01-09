import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MemberdeclsTest {

    private Memberdecls memberdecls;

    // Test ID 40
    @Test
    void toStringID40Test() {


        ArrayList<Fielddecl> fs = new ArrayList<>();
        ArrayList<Methoddecl> ms = new ArrayList<>();

        String type = "int";
        String id = "value";
        int len = 3;

        Fielddecl fielddecl = new Fielddecl(type, id, len);

        fs.add(fielddecl);


        Memberdecls mds = new Memberdecls(fs,ms);

        String s = mds.toString(0);
        String b = mds.toStringID40(0);

        assertFalse( s == b );
    }
}