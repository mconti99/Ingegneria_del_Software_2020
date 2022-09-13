package Entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


import Stub.StubProgrammaCashBack;
public class ProgrammaCashBack {
  static {
    CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.ping();
  }


	private ArrayList<Registrazione> registrazioni;
	private int codice;
	private String dataFine;
	private int numeroMinimo;
	private int percentuale;
	private int tetto;


	public Registrazione VerificaRegistrazione(String id, String psw) {
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[1]++;
int i=0;
byte CodeCoverLoopChoiceHelper_L1 = 0;


int CodeCoverConditionCoverageHelper_C1;
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[2]++;
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[1]++;
while((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((i<registrazioni.size()) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false)){
if (CodeCoverLoopChoiceHelper_L1 == 0) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[1]--;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[2]++;
} else if (CodeCoverLoopChoiceHelper_L1 == 1) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[2]--;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[3]++;
}
int CodeCoverConditionCoverageHelper_C2;
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[3]++;
if ((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && ((
(((CodeCoverConditionCoverageHelper_C2 |= (8)) == 0 || true) &&
 ((registrazioni.get(i).getId().equals(id)) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (4)) == 0 || true)))
) && (
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((registrazioni.get(i).getPassword().equals(psw)) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 2) || true)) || (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 2) && false)) {
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[1]++;
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[4]++;
return registrazioni.get(i);

			} else {
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[2]++;
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[5]++;
i++;
			}
		}
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[6]++;
return null;
	}

	public float CalcolaRimborso(Registrazione reg) {
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[7]++;
int importotale = reg.CalcolaImporto();
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[8]++;
float rimb = (importotale*this.percentuale)/100;
int CodeCoverConditionCoverageHelper_C3;
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[9]++;
if((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((rimb>=tetto) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) || true)) || (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) && false)) {
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[3]++; CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[10]++;
rimb=tetto;
} else {
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[4]++;}
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[11]++;
reg.setRimborso(rimb);
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[12]++;
return rimb;
	}

	public boolean VerificaData() {
			
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[13]++;
DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[14]++;
Calendar cal  = Calendar.getInstance();
boolean CodeCoverTryBranchHelper_Try1 = false;
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[15]++;
try {
CodeCoverTryBranchHelper_Try1 = true;
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[16]++;
cal.setTime(df.parse(this.dataFine));
			} catch (ParseException e) {
CodeCoverTryBranchHelper_Try1 = false;
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[6]++;
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[17]++;
e.printStackTrace();
			} finally {
    if ( CodeCoverTryBranchHelper_Try1 ) {
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[5]++;
}
  }
			
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[18]++;
Calendar today = Calendar.getInstance();
int CodeCoverConditionCoverageHelper_C4;
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[19]++;
if((((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((today.compareTo(cal)>0) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) || true)) || (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) && false)) {
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[7]++; CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[20]++;
return true;
}
			
		    else {
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[8]++; CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[21]++;
return false;
}	
	}
	public boolean VerificaAcquisti(Registrazione reg) {
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[22]++;
int cont = reg.ContaNumeroAcquisti();
int CodeCoverConditionCoverageHelper_C5;
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[23]++;
if((((((CodeCoverConditionCoverageHelper_C5 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C5 |= (2)) == 0 || true) &&
 ((cont>=numeroMinimo) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 1) || true)) || (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 1) && false)) {
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[9]++; CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[24]++;
return true;
}
		else {
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.branches[10]++; CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[25]++;
return false;
}
	}
	ProgrammaCashBack(int codice){
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[26]++;
StubProgrammaCashBack StPB = new StubProgrammaCashBack(codice);
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[27]++;
this.codice=StPB.getCodice();
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[28]++;
this.dataFine=StPB.getDataFine();
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[29]++;
this.numeroMinimo=StPB.getNumeroMinimo();
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[30]++;
this.percentuale=StPB.getPercentuale();
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[31]++;
this.tetto=StPB.getTetto();
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[32]++;
registrazioni = new ArrayList<Registrazione>();
byte CodeCoverLoopChoiceHelper_L2 = 0;


int CodeCoverConditionCoverageHelper_C6;
		
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[33]++;
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[4]++;
for(int i=0;(((((CodeCoverConditionCoverageHelper_C6 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C6 |= (2)) == 0 || true) &&
 ((i<StPB.getRegistrazioni().size()) && 
  ((CodeCoverConditionCoverageHelper_C6 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) || true)) || (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) && false);i++) {
if (CodeCoverLoopChoiceHelper_L2 == 0) {
  CodeCoverLoopChoiceHelper_L2++;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[4]--;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[5]++;
} else if (CodeCoverLoopChoiceHelper_L2 == 1) {
  CodeCoverLoopChoiceHelper_L2++;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[5]--;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[6]++;
}
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[34]++;
Registrazione R = new Registrazione();
byte CodeCoverLoopChoiceHelper_L3 = 0;


int CodeCoverConditionCoverageHelper_C7;
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[35]++;
CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[7]++;
for(int j=0;(((((CodeCoverConditionCoverageHelper_C7 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C7 |= (2)) == 0 || true) &&
 ((j<StPB.getRegistrazioni().get(i).getAcquisti().size()) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 1) || true)) || (CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 1) && false);j++) {
if (CodeCoverLoopChoiceHelper_L3 == 0) {
  CodeCoverLoopChoiceHelper_L3++;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[7]--;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[8]++;
} else if (CodeCoverLoopChoiceHelper_L3 == 1) {
  CodeCoverLoopChoiceHelper_L3++;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[8]--;
  CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.loops[9]++;
}
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[36]++;
Acquisto A = new Acquisto();
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[37]++;
A.setData(StPB.getRegistrazioni().get(i).getAcquisti().get(j).getData());
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[38]++;
A.setImporto(StPB.getRegistrazioni().get(i).getAcquisti().get(j).getImporto());
				CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[39]++;
R.getAcquisti().add(A);
			}
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[40]++;
R.setId(StPB.getRegistrazioni().get(i).getId());
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[41]++;
R.setPassword(StPB.getRegistrazioni().get(i).getPassword());
			CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[42]++;
registrazioni.add(R);
		}
		
	}

	public int getCodice() {
		CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht.statements[43]++;
return codice;
	}

}

class CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("C:\\Users\\itama\\Desktop\\N46004211-Conti\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\N46004211-Conti-ProgettoJava\\org.codecover.eclipse\\coverage-logs\\coverage-log-file.clf"), "fc824915-6d01-49ba-9acd-37a5396028e5").addObservedContainer(new CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht ());
  }
    public static long[] statements = new long[44];
    public static long[] branches = new long[11];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[8];
  static {
    final String SECTION_NAME = "Entity.ProgrammaCashBack.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1,2,1,1,1,1,1};
    for (int i = 1; i <= 7; i++) {
      switch (CONDITION_COUNTER_TYPES[i]) {
        case 0 : break;
        case 1 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallOneConditionCounter(SECTION_NAME, "C" + i); break;
        case 2 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.SmallTwoConditionCounter(SECTION_NAME, "C" + i); break;
        case 3 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.MediumConditionCounter(SECTION_NAME, "C" + i); break;
        case 4 : conditionCounters[i] = new org.codecover.instrumentation.java.measurement.LargeConditionCounter(SECTION_NAME, "C" + i); break;
      }
    }
  }
    public static long[] loops = new long[10];
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

  public CodeCoverCoverageCounter$d76wwbrnfi54wtzndb8yyqjgti8b8jxaht () {
    super("Entity.ProgrammaCashBack.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 43; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 10; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 7; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].reset();
      }
    }
      for (int i = 1; i <= 9; i++) {
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
    log.startNamedSection("Entity.ProgrammaCashBack.java");
      for (int i = 1; i <= 43; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 10; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 7; i++) {
      if (conditionCounters[i] != null) {
        conditionCounters[i].serializeAndReset(log);
      }
    }
      for (int i = 1; i <= 3; i++) {
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
