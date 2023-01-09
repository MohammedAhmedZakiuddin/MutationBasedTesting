class BinaryOp extends BaseToken {
  String op;
  public BinaryOp(String op) {
    this.op = op;
  }

  public boolean isArithmetic() {
    return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
  }
  public boolean isRelational() {
    return op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("==") || op.equals("<>");
  }
  public boolean isLogical() {
    return op.equals("||") || op.equals("&&");
  }
  public String toString() {
    return op;
  }


  // Mutants for is Relational

  // Mutant ID 1
  public boolean isRelationalID1() {
    return op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("==");
  }

  // Mutant ID 2
  public boolean isRelationalID2() {
    return op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("<>");
  }

  // Mutant ID 3
  public boolean isRelationalID3() {
    return op.equals("<") || op.equals("<=") || op.equals(">") ||  op.equals("==") || op.equals("<>");
  }

  // Mutant ID 4
  public boolean isRelationalID4() {
    return op.equals("<") || op.equals("<=") || op.equals(">=") || op.equals("==") || op.equals("<>");
  }

  // Mutant ID 5
  public boolean isRelationalID5() {
    return op.equals("<") || op.equals(">") || op.equals(">=") || op.equals("==") || op.equals("<>");
  }

  // Mutant ID 6
  public boolean isRelationalID6() {
    return op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("==") || op.equals("<>");
  }


  // Mutants for isLogical

  // Mutant ID 7
  public boolean isLogicalID7() {
    return op.equals("&&");
  }

  // Mutant ID 8
  public boolean isLogicalID8() {
    return op.equals("||");
  }


  // Mutants for isArithmetic

  // Mutant ID 9
  public boolean isArithmeticID9() {
    return op.equals("-") || op.equals("*") || op.equals("/");
  }

  // Mutant ID 10
  public boolean isArithmeticID10() {
    return op.equals("+") || op.equals("*") || op.equals("/");
  }

  // Mutant ID 11
  public boolean isArithmeticID11() {
    return op.equals("+") || op.equals("-") || op.equals("/");
  }

  // Mutant ID 12
  public boolean isArithmeticID12() {
    return op.equals("+") || op.equals("-") || op.equals("*") ;
  }


}