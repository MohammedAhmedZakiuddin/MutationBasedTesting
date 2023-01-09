import java.lang.reflect.Field;
import java.util.ArrayList;

class Memberdecls extends BaseToken {
  ArrayList<Fielddecl> fielddecls;
  ArrayList<Methoddecl> methoddecls;
  public Memberdecls(Fielddecl f, Memberdecls mds) {
    mds.fielddecls.add(0, f);
    this.fielddecls = mds.fielddecls;
    this.methoddecls = mds.methoddecls;
  }
  public Memberdecls(ArrayList<Fielddecl> fs, ArrayList<Methoddecl> ms) {
    fielddecls = fs;
    methoddecls = ms;
  }
  public Memberdecls(ArrayList<Methoddecl> ms) {
    fielddecls = new ArrayList<Fielddecl>();
    methoddecls = ms;
  }

  public String toString(int depth) {
    String result = "";
    for (Fielddecl f: fielddecls)
      result += f.toString(depth) + "\n";
    for (Methoddecl m: methoddecls)
      result += m.toString(depth) + "\n";
    return result;
  }

  // Mutants for toString

  // Mutant ID 40
  public String toStringID40(int depth) {
    String result = "";
    return result;
  }

  public void typeCheck() throws Exception {
    table.createScope();
    for (Fielddecl f: fielddecls)
      f.typeCheck();
    for (Methoddecl m: methoddecls)
      m.typeCheck();
    table.destroyScope();
  }
}