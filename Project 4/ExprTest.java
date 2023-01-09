import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExprTest {

    private Expr expr;

    @Test // Test ID 13
    void toStringID13Test()
    {
        expr = new Expr("foo",'a');
        String s = expr.toString();
        String b = expr.toStringID13();

        assertFalse(b == s);
    }

    @Test // Test ID 14
    void toStringID14Test()
    {
        expr = new Expr("foo",'s');
        String s = expr.toString();
        String b = expr.toStringID14();

        assertFalse(b == s);
    }

    @Test // Test ID 15
    void toStringID15Test()
    {
        expr = new Expr(1);
        String s = expr.toString();
        String b = expr.toStringID15();


        assertFalse(b == s);
    }

    @Test // Test ID 16
    void toStringID16Test()
    {
        float x = 1;
        expr = new Expr(x);
        String s = expr.toString();
        String b = expr.toStringID16();

        assertFalse(b == s);
    }

    @Test // Test ID 17
    void toStringID17Test()
    {
        String n = "foo";
        Name nono = new Name(n);
        expr = new Expr(nono);
        String s = expr.toString();
        String b = expr.toStringID17();

        assertFalse(b == s);
    }

    @Test // Test ID 18
    void toStringID18Test()
    {
        expr = new Expr(true);
        String s = expr.toString();
        String b = expr.toStringID18();

        assertFalse(b == s);

    }

    @Test // Test ID 19
    void toStringID19Test()
    {

        Expr expr1 = new Expr(111);
        expr = new Expr(expr1);
        String s = expr.toString();
        String b = expr.toStringID19();

        assertFalse(b == s);

    }

    @Test // Test ID 20
    void toStringID20Test()
    {
        Expr expr1 = new Expr("foo",'s');
        expr = new Expr(expr1,"boo");
        String s = expr.toString();
        String b = expr.toStringID20();

        assertFalse(b == s);
    }

    @Test // Test ID 21
    void toStringID21Test()
    {
        Expr expr1 = new Expr("x",'s');
        expr = new Expr("int",expr1);
        String s = expr.toString();
        String b = expr.toStringID21();

        assertFalse(b == s);
    }

    @Test // Test ID 22
    void toStringID22Test()
    {
        BinaryOp binaryOp = new BinaryOp("+");
        Expr expr1 = new Expr("y",'s');
        expr = new Expr(expr1,binaryOp,expr1);
        String s = expr.toString();
        String b = expr.toStringID22();

        assertFalse(b == s);
    }

    @Test // Test ID 23
    void toStringID23Test()
    {
        Expr expr1 = new Expr("1",'s');
        expr = new Expr(expr1,expr1,expr1);
        String s = expr.toString();
        String b = expr.toStringID23();

        assertFalse(b == s);
    }

    @Test // Test ID 24
    void toStringID24Test()
    {
        Expr expr1 = new Expr("len",'s');
        Expr expr2 = new Expr("x",'s');
        ArrayList<Expr> exprs = new ArrayList<>();
        exprs.add(expr2);
        exprs.add(expr1);
        expr = new Expr("foo",exprs);
        String s = expr.toString();
        String b = expr.toStringID23();

        assertFalse(b == s);

    }

    @Test // Test ID 25
    void toStringID25Test()
    {
        expr = new Expr("sum",false);
        String s = expr.toString();
        String b = expr.toStringID23();

        assertFalse(b == s);
    }

}