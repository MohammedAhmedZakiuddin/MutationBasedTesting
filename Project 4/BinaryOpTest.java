import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryOpTest {

    private BinaryOp binaryOp;


    @Test
    void isRelationalID1Test() // Test ID 1
    {
        binaryOp = new BinaryOp("<>");

        assertFalse(binaryOp.isRelationalID1() == binaryOp.isRelational());
        //                          False           !=            True
    }

    @Test
    void isRelationalID2Test() // Test ID 2
    {
        binaryOp = new BinaryOp("==");
        assertFalse(binaryOp.isRelationalID2() == binaryOp.isRelational());
    }

    @Test
    void isRelationalID3Test() // Test ID 3
    {
        binaryOp = new BinaryOp(">=");
        assertFalse(binaryOp.isRelationalID3() == binaryOp.isRelational());
    }

    @Test
    void isRelationalID4Test() // Test ID 4
    {
        binaryOp = new BinaryOp(">");
        assertFalse(binaryOp.isRelationalID4() == binaryOp.isRelational());
    }

    @Test
    void isRelationalID5Test() // Test ID 5
    {
        binaryOp = new BinaryOp("<=");
        assertFalse(binaryOp.isRelationalID5() == binaryOp.isRelational());
    }

    @Test
    void isRelationalID6Test() // Test ID 6
    {
        binaryOp = new BinaryOp("<");
        assertFalse(binaryOp.isRelationalID6() == binaryOp.isRelational());
    }

    @Test // Test ID 7
    void isLogicalID7Test()
    {
        binaryOp = new BinaryOp("||");
        assertFalse(binaryOp.isLogicalID7() == binaryOp.isLogical());
    }

    @Test // Test ID 8
    void isLogicalID8Test()
    {
        binaryOp = new BinaryOp("&&");
        assertFalse(binaryOp.isLogicalID8() == binaryOp.isLogical());

    }

    @Test // Test ID 9
    void isArithmeticID9Test()
    {
        binaryOp = new BinaryOp("+");
        assertFalse(binaryOp.isArithmeticID9() == binaryOp.isArithmetic());
    }

    @Test // Test ID 10
    void isArithmeticID10Test()
    {
        binaryOp = new BinaryOp("-");
        assertFalse(binaryOp.isArithmeticID10() == binaryOp.isArithmetic());
    }

    @Test // Test ID 11
    void isArithmeticID11Test()
    {
        binaryOp = new BinaryOp("*");
        assertFalse(binaryOp.isArithmeticID11() == binaryOp.isArithmetic());
    }

    @Test // Test ID 12
    void isArithmeticID12Test()
    {
        binaryOp = new BinaryOp("/");
        assertFalse(binaryOp.isArithmeticID12() == binaryOp.isArithmetic());
    }
}