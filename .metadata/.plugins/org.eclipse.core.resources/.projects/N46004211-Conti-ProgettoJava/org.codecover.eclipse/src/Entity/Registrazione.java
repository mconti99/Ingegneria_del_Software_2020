package Entity;



import java.util.*;

public class Registrazione {
  static {
    CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.ping();
  }


	private ArrayList<Acquisto> acquisti;
	private Rimborso rimborso;
	private String id;
	private String password;

	public void setRimborso(float importo) {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[1]++;
this.rimborso.setRimborso(importo);
	}
	public ArrayList<Acquisto> getAcquisti() {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[2]++;
return acquisti;
	}

	public void setAcquisti(ArrayList<Acquisto> acquisti) {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[3]++;
this.acquisti = acquisti;
	}

	public String getId() {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[4]++;
return id;
	}

	public void setId(String id) {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[5]++;
this.id = id;
	}

	public String getPassword() {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[6]++;
return password;
	}

	public void setPassword(String password) {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[7]++;
this.password = password;
	}

	

	public int ContaNumeroAcquisti() {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[8]++;
return this.acquisti.size();
	}


	public int CalcolaImporto() {
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[9]++;
int totale=0;
byte CodeCoverLoopChoiceHelper_L1 = 0;


int CodeCoverConditionCoverageHelper_C1;
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[10]++;
CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.loops[1]++;
for(int i=0;(((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((i<acquisti.size()) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false);i++) {
if (CodeCoverLoopChoiceHelper_L1 == 0) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.loops[1]--;
  CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.loops[2]++;
} else if (CodeCoverLoopChoiceHelper_L1 == 1) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.loops[2]--;
  CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.loops[3]++;
}
			CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[11]++;
totale += (acquisti.get(i).getImporto());
		}
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[12]++;
return totale;
	}
	
	Registrazione(){
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[13]++;
acquisti = new ArrayList<Acquisto>();
		CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp.statements[14]++;
rimborso = new Rimborso ();
	}
	/*Registrazione(String id, String psw){
		StubRegistrazione StR = new StubRegistrazione(id, psw);
		this.id=StR.getId();
		this.password=StR.getPassword();
		acquisti = new ArrayList<Acquisto>();
		for(int i=0;i<StR.getAcquisti().size();i++) {
			Acquisto A = new Acquisto();
			A.setData(StR.getAcquisti().get(i).getData());
			A.setImporto(StR.getAcquisti().get(i).getImporto());
			acquisti.add(A);
		}
		rimborso = new Rimborso();
		
	}
	*/
}

class CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("C:\\Users\\itama\\Desktop\\N46004211-Conti\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\N46004211-Conti-ProgettoJava\\org.codecover.eclipse\\coverage-logs\\coverage-log-file.clf"), "fc824915-6d01-49ba-9acd-37a5396028e5").addObservedContainer(new CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp ());
  }
    public static long[] statements = new long[15];
    public static long[] branches = new long[0];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[2];
  static {
    final String SECTION_NAME = "Entity.Registrazione.java";
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
    public static long[] loops = new long[4];
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

  public CodeCoverCoverageCounter$6uo7tontp2ze609mbatk90wh1fmp () {
    super("Entity.Registrazione.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 14; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= -1; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 1; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 3; i++) {
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
    log.startNamedSection("Entity.Registrazione.java");
      for (int i = 1; i <= 14; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= -1; i++) {
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
      for (int i = 1; i <= 1; i++) {
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
