import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StmtTest {

    private Expr expr;
    private Stmt stmt;
    private Stmt elsest;

    // Test ID 26
    @Test
    void toStringID26Test() {
        expr = new Expr(1);
        stmt = new Stmt("x");
        elsest = new Stmt("y");

        Stmt stmt1 = new Stmt(expr, stmt, elsest);
        String s = stmt1.toString(0);
        String b = stmt1.toStringID26(0);

        assertFalse(s == b);
    }
    // Test ID 27
    @Test
    void toStringID27Test()
    {
        String id = "foo";
        ArrayList<Expr> ag = new ArrayList<>();
        boolean func = true;

        stmt = new Stmt(id,ag,func);
        String s = stmt.toString(0);
        String b = stmt.toStringID27(0);

        assertFalse(s == b);

    }

    // Test ID 28
    @Test
    void toStringID28Test()
    {
        ArrayList<Fielddecl> fs = new ArrayList<>();
        ArrayList<Stmt> sts = new ArrayList<>();
        boolean x = true;

        stmt = new Stmt(fs,sts,x);

        String s = stmt.toString(0);
        String b = stmt.toStringID28(0);
        assertFalse(s==b);

    }

    // Test ID 29
    @Test
    void toStringID29Test()
    {
        Stmt st = new Stmt("x");
        expr = new Expr(1);
        stmt = new Stmt(expr,st);

        String s = stmt.toString(0);
        String b = stmt.toStringID29(0);
        assertFalse(s==b);


    }

    // Test ID 30
    @Test
    void toStringID30Test()
    {
        Name n = new Name("x");
        expr = new Expr(1);
        stmt = new Stmt(n,expr);
        String s = stmt.toString(0);
        String b = stmt.toStringID30(0);
        assertFalse(s==b);


    }

    // Test ID 31
    @Test
    void toStringID31Test()
    {
        String func = "read";
        ArrayList lst = new ArrayList();
        stmt = new Stmt(func,lst);
        String s = stmt.toString(0);
        String b = stmt.toStringID31(0);
        assertFalse(s==b);



    }

    // Test ID 32
    @Test
    void toStringID32Test()
    {
        String func = "print";
        ArrayList lst = new ArrayList();
        stmt = new Stmt(func,lst);
        String s = stmt.toString(0);
        String b = stmt.toStringID32(0);
        assertFalse(s==b);

    }

    // Test ID 33
    @Test
    void toStringID33Test()
    {
        String func = "not";
        ArrayList lst = new ArrayList();
        stmt = new Stmt(func,lst);
        String s = stmt.toString(0);
        String b = stmt.toStringID33(0);
        assertFalse(s==b);

    }

    // Test ID 34
    @Test
    void toStringID34Test()
    {
        Name n = new Name("x");
        String unary= "var";
        stmt = new Stmt(n,unary);
        String s = stmt.toString(0);
        String b = stmt.toStringID34(0);
        assertFalse(s==b);


    }

    // Test ID 35
    @Test
    void toStringID35Test()
    {
        expr = new Expr(1);
        stmt = new Stmt(expr);
        String s = stmt.toString(0);
        String b = stmt.toStringID35(0);
        assertFalse(s==b);

    }

    // Test ID 36
    @Test
    void toStringID36Test()
    {
        stmt = new Stmt("x");
        String s = stmt.toString(0);
        String b = stmt.toStringID36(0);
        assertFalse(s==b);

    }

    // Test ID 37
    @Test
    void toStringID37Test()
    {
        stmt = new Stmt();
        String s = stmt.toString(0);
        String b = stmt.toStringID37(0);
        assertFalse(s==b);

    }

}