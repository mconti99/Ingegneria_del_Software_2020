package Entity;

import java.util.*;

public class ApplicazioneCashBack {
  static {
    CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.ping();
  }


	static ArrayList<ProgrammaCashBack> programmi;
	static { CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[1]++; }
private static ApplicazioneCashBack istanza=null;
	public static void init() {
int CodeCoverConditionCoverageHelper_C1;
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[2]++;
if((((((CodeCoverConditionCoverageHelper_C1 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C1 |= (2)) == 0 || true) &&
 ((istanza==null) && 
  ((CodeCoverConditionCoverageHelper_C1 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[1].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C1, 1) && false)) {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[1]++; CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[3]++;
istanza=new ApplicazioneCashBack();
} else {
  CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[2]++;}
	}

	static public ProgrammaCashBack VerificaProgramma(int codice) {
			CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[4]++;
int i=0;
			CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[5]++;
boolean trovato=false;
byte CodeCoverLoopChoiceHelper_L1 = 0;


int CodeCoverConditionCoverageHelper_C2;
			CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[6]++;
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.loops[1]++;
while((((((CodeCoverConditionCoverageHelper_C2 = 0) == 0) || true) && ((
(((CodeCoverConditionCoverageHelper_C2 |= (8)) == 0 || true) &&
 ((i<programmi.size()) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (4)) == 0 || true)))
) && (!
(((CodeCoverConditionCoverageHelper_C2 |= (2)) == 0 || true) &&
 ((trovato) && 
  ((CodeCoverConditionCoverageHelper_C2 |= (1)) == 0 || true)))
))) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 2) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[2].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C2, 2) && false)){
if (CodeCoverLoopChoiceHelper_L1 == 0) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.loops[1]--;
  CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.loops[2]++;
} else if (CodeCoverLoopChoiceHelper_L1 == 1) {
  CodeCoverLoopChoiceHelper_L1++;
  CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.loops[2]--;
  CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.loops[3]++;
}
int CodeCoverConditionCoverageHelper_C3;
				CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[7]++;
if ((((((CodeCoverConditionCoverageHelper_C3 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C3 |= (2)) == 0 || true) &&
 ((programmi.get(i).getCodice() == codice) && 
  ((CodeCoverConditionCoverageHelper_C3 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[3].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C3, 1) && false)) {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[3]++;
					CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[8]++;
trovato=true;

				} else {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[4]++;
					CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[9]++;
i++;
				}
			}
int CodeCoverConditionCoverageHelper_C4;
			CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[10]++;
if ((((((CodeCoverConditionCoverageHelper_C4 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C4 |= (2)) == 0 || true) &&
 ((trovato) && 
  ((CodeCoverConditionCoverageHelper_C4 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[4].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C4, 1) && false)) {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[5]++;
				CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[11]++;
return programmi.get(i);

			} else {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[6]++;
				CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[12]++;
return null;
			}
		}

	static public float RichiediRimborso(int codice, String id, String psw) {
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[13]++;
ProgrammaCashBack prog=VerificaProgramma(codice);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[14]++;
Registrazione reg = prog.VerificaRegistrazione(id, psw);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[15]++;
float rimb = prog.CalcolaRimborso(reg);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[16]++;
return rimb;
	}

	
	static public String VerificaRimborso(int codice, String id, String psw) {
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[17]++;
ProgrammaCashBack prog=VerificaProgramma(codice);
int CodeCoverConditionCoverageHelper_C5;
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[18]++;
if((((((CodeCoverConditionCoverageHelper_C5 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C5 |= (2)) == 0 || true) &&
 ((prog==null) && 
  ((CodeCoverConditionCoverageHelper_C5 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 1) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[5].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C5, 1) && false)) {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[7]++; CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[19]++;
return "Programma di CashBack non esistente";
}
		else {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[8]++;
			CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[20]++;
Registrazione reg = prog.VerificaRegistrazione(id, psw);
int CodeCoverConditionCoverageHelper_C6;
			CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[21]++;
if((((((CodeCoverConditionCoverageHelper_C6 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C6 |= (2)) == 0 || true) &&
 ((reg==null) && 
  ((CodeCoverConditionCoverageHelper_C6 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[6].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C6, 1) && false)) {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[9]++; CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[22]++;
return "Registrazione non esistente";
}
			else {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[10]++;
int CodeCoverConditionCoverageHelper_C7;
				CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[23]++;
if((((((CodeCoverConditionCoverageHelper_C7 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C7 |= (2)) == 0 || true) &&
 ((prog.VerificaData()==false) && 
  ((CodeCoverConditionCoverageHelper_C7 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 1) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[7].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C7, 1) && false)) {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[11]++; CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[24]++;
return "Il programma non è ancora finito";
}
				else {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[12]++;
					CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[25]++;
boolean numeroMin=prog.VerificaAcquisti(reg);
int CodeCoverConditionCoverageHelper_C8;
					CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[26]++;
if((((((CodeCoverConditionCoverageHelper_C8 = 0) == 0) || true) && (
(((CodeCoverConditionCoverageHelper_C8 |= (2)) == 0 || true) &&
 ((numeroMin==false) && 
  ((CodeCoverConditionCoverageHelper_C8 |= (1)) == 0 || true)))
)) && (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 1) || true)) || (CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.conditionCounters[8].incrementCounterOfBitMask(CodeCoverConditionCoverageHelper_C8, 1) && false)) {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[13]++; CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[27]++;
return "Non hai fatto abbastanza acquisti";
}
					else {
CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.branches[14]++;
						CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[28]++;
return "Inserimento dei dati valido, richiesta in corso";
					}
				}
			}
		}
	}
	private ApplicazioneCashBack(){
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[29]++;
programmi = new ArrayList<ProgrammaCashBack>();
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[30]++;
ProgrammaCashBack PCB1 = new ProgrammaCashBack(100000);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[31]++;
ProgrammaCashBack PCB2 = new ProgrammaCashBack(100001);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[32]++;
ProgrammaCashBack PCB3 = new ProgrammaCashBack(100002);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[33]++;
ApplicazioneCashBack.programmi.add(PCB1);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[34]++;
ApplicazioneCashBack.programmi.add(PCB2);
		CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9.statements[35]++;
ApplicazioneCashBack.programmi.add(PCB3);
	}
}

class CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance("C:\\Users\\itama\\Desktop\\N46004211-Conti\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\N46004211-Conti-ProgettoJava\\org.codecover.eclipse\\coverage-logs\\coverage-log-file.clf"), "fc824915-6d01-49ba-9acd-37a5396028e5").addObservedContainer(new CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9 ());
  }
    public static long[] statements = new long[36];
    public static long[] branches = new long[15];

  public static final org.codecover.instrumentation.java.measurement.ConditionCounter[] conditionCounters = new org.codecover.instrumentation.java.measurement.ConditionCounter[9];
  static {
    final String SECTION_NAME = "Entity.ApplicazioneCashBack.java";
    final byte[] CONDITION_COUNTER_TYPES = {0,1,2,1,1,1,1,1,1};
    for (int i = 1; i <= 8; i++) {
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

  public CodeCoverCoverageCounter$2z92dimht4chi1e0usq4261qj3z9cg7m8yhffq9 () {
    super("Entity.ApplicazioneCashBack.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 35; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= 14; i++) {
        branches[i] = 0L;
      }
    for (int i = 1; i <= 8; i++) {
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
    log.startNamedSection("Entity.ApplicazioneCashBack.java");
      for (int i = 1; i <= 35; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= 14; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
    for (int i = 1; i <= 8; i++) {
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
