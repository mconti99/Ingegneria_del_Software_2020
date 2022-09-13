package Control;

public class RichiestaRimborsoController {
  static {
    CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.ping();
  }

	static public String RichiestaRimborsoHandler(int codice, String id, String psw) {
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[1]++;
String stringa = VerificaRimborso(codice, id, psw);
int CodeCoverConditionCoverageHelper_C1;
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[2]++;
if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((stringa.equals("Inserimento dei dati valido, richiesta in corso")) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false)) {
CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.branches[1]++;
			CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[3]++;
stringa = "Il rimborso che riceverai sul conto corrente è di " + Float.toString(RichiestaRimborso(codice, id, psw)) + " euro";

		} else {
  CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.branches[2]++;}
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[4]++;
return stringa;
	}

	
	static private float RichiestaRimborso(int codice, String id, String psw) {
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[5]++;
float imp=Entity.ApplicazioneCashBack.RichiediRimborso(codice, id, psw);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[6]++;
return imp;
	}

	
	static private String VerificaRimborso(int codice, String id, String psw) {
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[7]++;
Entity.ApplicazioneCashBack.init();
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[8]++;
String stringa=Entity.ApplicazioneCashBack.VerificaRimborso(codice, id, psw);
		CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5.statements[9]++;
return stringa;
	}

}

class CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("C:\\Users\\itama\\Desktop\\N46004211-Conti\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\N46004211-Conti-ProgettoJava\\org.codecover.eclipse\\coverage-logs\\coverage-log-file.clf"), "fc824915-6d01-49ba-9acd-37a5396028e5").addObservedContainer(new CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5 ());
  }
    public static long[] statements = new long[10];
    public static long[] branches = new long[3];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[2];
  static {
    final String SECTION_NAME = "Control.RichiestaRimborsoController.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1};
    for (int i = 1; i <= 1; i++) {
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

  public CodeCoverCoverageCounter$21y0gfkl1h3rl2hm1gkwzqjpfb82nridshdb502bhuejrpdpb5 () {
    super("Control.RichiestaRimborsoController.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 9; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 2; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 1; i++) {
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
    log.startNamedSection("Control.RichiestaRimborsoController.java");
      for (int i = 1; i <= 9; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 2; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 1; i++) {
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
