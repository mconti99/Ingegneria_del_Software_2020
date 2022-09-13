package Stub;

import java.util.ArrayList;

public class StubRegistrazione {
  static {
    CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.ping();
  }


	private ArrayList<StubAcquisto> acquisti;
	private StubRimborso rimborso;
	private String id;
	private String password;
	
	public ArrayList<StubAcquisto> getAcquisti() {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[1]++;
return acquisti;
	}

	public StubRimborso getRimborso() {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[2]++;
return rimborso;
	}

	public void setRimborso(StubRimborso rimborso) {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[3]++;
this.rimborso = rimborso;
	}

	public void setAcquisti(ArrayList<StubAcquisto> acquisti) {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[4]++;
this.acquisti = acquisti;
	}

	public String getId() {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[5]++;
return id;
	}
	public void setId(String id) {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[6]++;
this.id = id;
	}
	public String getPassword() {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[7]++;
return password;
	}
	public void setPassword(String password) {
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[8]++;
this.password = password;
	}

	public StubRegistrazione(String id, String psw) {
int CodeCoverConditionCoverageHelper_C1;
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[9]++;
if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (8)) == 0 || true) &&
 ((id.equals("matteo.conti000")) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((psw.equals("maradona10")) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 2) || true)) || (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 2) && false)) {
CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[1]++;
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[10]++;
this.setId("matteo.conti000");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[11]++;
this.setPassword("maradona10");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[12]++;
acquisti = new ArrayList<StubAcquisto>();
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[13]++;
StubAcquisto ACQ1 = new StubAcquisto("12/01/2019", 100);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[14]++;
StubAcquisto ACQ2 = new StubAcquisto("14/01/2019", 150);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[15]++;
StubAcquisto ACQ3 = new StubAcquisto("15/04/2019", 20);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[16]++;
this.acquisti.add(ACQ1);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[17]++;
this.acquisti.add(ACQ2);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[18]++;
this.acquisti.add(ACQ3);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[19]++;
rimborso = new StubRimborso(0);

		} else {
  CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[2]++;}
int CodeCoverConditionCoverageHelper_C2;
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[20]++;
if((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C2 |= (8)) == 0 || true) &&
 ((id.equals("franknapoli.123")) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((psw.equals("ciaociao99")) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 2) || true)) || (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 2) && false)) {
CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[3]++;
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[21]++;
this.setId("franknapoli.123");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[22]++;
this.setPassword("ciaociao99");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[23]++;
acquisti = new ArrayList<StubAcquisto>();
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[24]++;
StubAcquisto ACQ1 = new StubAcquisto("12/02/2020", 700);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[25]++;
StubAcquisto ACQ2 = new StubAcquisto("14/01/2020", 210);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[26]++;
StubAcquisto ACQ3 = new StubAcquisto("01/04/2020", 110);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[27]++;
StubAcquisto ACQ4 = new StubAcquisto("13/12/2020", 10);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[28]++;
this.acquisti.add(ACQ1);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[29]++;
this.acquisti.add(ACQ2);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[30]++;
this.acquisti.add(ACQ3);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[31]++;
this.acquisti.add(ACQ4);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[32]++;
rimborso = new StubRimborso(0);


		} else {
  CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[4]++;}
int CodeCoverConditionCoverageHelper_C3;
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[33]++;
if((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (8)) == 0 || true) &&
 ((id.equals("eduard.conti123")) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((psw.equals("lavezzi000")) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 2) || true)) || (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 2) && false)) {
CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[5]++;
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[34]++;
this.setId("eduard.conti123");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[35]++;
this.setPassword("lavezzi000");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[36]++;
acquisti = new ArrayList<StubAcquisto>();
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[37]++;
StubAcquisto ACQ1 = new StubAcquisto("02/01/2021", 5);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[38]++;
StubAcquisto ACQ2 = new StubAcquisto("03/01/2021", 15);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[39]++;
StubAcquisto ACQ3 = new StubAcquisto("10/01/2021", 500);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[40]++;
this.acquisti.add(ACQ1);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[41]++;
this.acquisti.add(ACQ2);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[42]++;
this.acquisti.add(ACQ3);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[43]++;
rimborso = new StubRimborso(0);


		} else {
  CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[6]++;}
int CodeCoverConditionCoverageHelper_C4;
		CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[44]++;
if((((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (8)) == 0 || true) &&
 ((id.equals("antonio.guarino")) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (4)) == 0 || true)))
 && 
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((psw.equals("osimhen100")) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 2) || true)) || (CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 2) && false)) {
CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[7]++;
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[45]++;
this.setId("antonio.guarino");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[46]++;
this.setPassword("osimhen100");
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[47]++;
acquisti = new ArrayList<StubAcquisto>();
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[48]++;
StubAcquisto ACQ1 = new StubAcquisto("16/11/2020", 15);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[49]++;
this.acquisti.add(ACQ1);
			CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.statements[50]++;
rimborso = new StubRimborso(0);


		} else {
  CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1.branches[8]++;}
	}

}

class CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("C:\\Users\\itama\\Desktop\\N46004211-Conti\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\N46004211-Conti-ProgettoJava\\org.codecover.eclipse\\coverage-logs\\coverage-log-file.clf"), "fc824915-6d01-49ba-9acd-37a5396028e5").addObservedContainer(new CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1 ());
  }
    public static long[] statements = new long[51];
    public static long[] branches = new long[9];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[5];
  static {
    final String SECTION_NAME = "Stub.StubRegistrazione.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,2,2,2,2};
    for (int i = 1; i <= 4; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[1];
    public static java.util.concurrent.atomic.AtomicLong[] syncs = new java.util.concurrent.atomic.AtomicLong[3];
    static {
      for (int i = 0; i <= 2; i++) {
        syncs[i] = new java.util.concurrent.atomic.AtomicLong(0L);
      }
    }
    public static java.util.Hashtable[] syncWaits = new java.util.Hashtable[1];
    static {
      for (int i = 0; i <= 0; i++) {
        syncWaits[i] = new java.util.Hashtable();
      }
    }
    public static long[] qmo = new long[2];

  public CodeCoverCoverageCounter$doyjet4c2c553n3ti0owsghmnf1tnd23c1 () {
    super("Stub.StubRegistrazione.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 50; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 8; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 4; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
      for (int i = 0; i <= 2; i++) {
        syncs[i].set(0L);
      }
      for (int i = 0; i < 2; i++) {
        qmo[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("Stub.StubRegistrazione.java");
      for (int i = 1; i <= 50; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 8; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 4; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
      for (int i = 0; i <= 0; i++) {
        if (syncs[i * 3].get() != 0L) {
          log.passCounter("Y" + i + "-0", syncs[i * 3].get());
          syncs[i * 3].set(0L);
        }
        if (syncs[i * 3 + 1].get() != 0L) {
          log.passCounter("Y" + i + "-1", syncs[i * 3 + 1].get());
          syncs[i * 3 + 1].set(0L);
        }
        if (syncs[i * 3 + 2].get() != 0L) {
          log.passCounter("Y" + i + "-2", syncs[i * 3 + 2].get());
          syncs[i * 3 + 2].set(0L);
        }
      }
      for (int i = 0; i < 1; i++) {
        if (qmo[i * 2] != 0L) {
          log.passCounter("Q" + i + "-0", qmo[i * 2]);
          qmo[i * 2] = 0L;
        }
        if (qmo[i * 2 + 1] != 0L) {
          log.passCounter("Q" + i + "-1", qmo[i * 2 + 1]);
          qmo[i * 2 + 1] = 0L;
        }
      }
  }
}
