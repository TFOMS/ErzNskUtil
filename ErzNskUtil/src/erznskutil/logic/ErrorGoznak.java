package erznskutil.logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="error_goznak")
public class ErrorGoznak {
    
	private String 	ENP_CALC, ENP_OUTPUT, DF, PACK_ID, STATUS, GD, ENP_FFOMS, OKATO_FFOMS, PRIM, TAG, ERR, PERSON_SURNAME, PERSON_KINDFIRSTNAME, PERSON_KINDLASTNAME, PERSON_BIRTHDAY, PERSON_ADDRESSID, PERSON_SERPOLICY, PERSON_NUMPOLICY, PERSON_SEX, PERSON_SERDOC, PERSON_NUMDOC, PERSON_REGNUMBER, PERSON_LINKSMOESTABLISHMENTID, PERSON_ESTABLISHMENTAMBUL, PERSON_DATECHANGE, PERSON_ESTABLISHMENTDENT, PERSON_SOCIALID, PERSON_STATUSID, PERSON_DOCPERSONID, PERSON_INSPECTION, PERSON_OPERATION, PERSON_STATUSREC, PERSON_OUTID, PERSON_INSPECTORID, PERSON_ESTABLISHMENTID, PERSON_DATEPOLICY, PERSON_DATEINPUT, ENP_IN, SMO_OLD, PERSONADD_ADDRESSID, PERSONADD_PRIM, SNILS, BORN, DATEPASSPORT, RUSSIAN, TELEDOM, TELEWORK, EMAIL, TELE2, DOK_VI, ENP, ZA, ZAD, ZAP, PRED, D_V, D_SER, D_NUM, D_DATE, METHOD, PETITION, FPOLIC, PR_FAM, PR_IM, PR_OT, PR_TEL, PR_ADRES, VS_NUM, VS_DATE, D1, D2, ENP_DATE, LAST_FAM, LAST_IM, LAST_OT, LAST_DR; 

    
    public ErrorGoznak(){
    	ENP_CALC = null;
    }
    
    public void setENP_OUTPUT(String eNP_OUTPUT) {
		ENP_OUTPUT = eNP_OUTPUT;
	}

	public void setDF(String dF) {
		DF = dF;
	}

	public void setPACK_ID(String pACK_ID) {
		PACK_ID = pACK_ID;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public void setGD(String gD) {
		GD = gD;
	}

	public void setENP_FFOMS(String eNP_FFOMS) {
		ENP_FFOMS = eNP_FFOMS;
	}

	public void setOKATO_FFOMS(String oKATO_FFOMS) {
		OKATO_FFOMS = oKATO_FFOMS;
	}

	public void setPRIM(String pRIM) {
		PRIM = pRIM;
	}

	public void setTAG(String tAG) {
		TAG = tAG;
	}

	public void setERR(String eRR) {
		ERR = eRR;
	}

	public void setPERSON_SURNAME(String pERSON_SURNAME) {
		PERSON_SURNAME = pERSON_SURNAME;
	}

	public void setPERSON_KINDFIRSTNAME(String pERSON_KINDFIRSTNAME) {
		PERSON_KINDFIRSTNAME = pERSON_KINDFIRSTNAME;
	}

	public void setPERSON_KINDLASTNAME(String pERSON_KINDLASTNAME) {
		PERSON_KINDLASTNAME = pERSON_KINDLASTNAME;
	}

	public void setPERSON_BIRTHDAY(String pERSON_BIRTHDAY) {
		PERSON_BIRTHDAY = pERSON_BIRTHDAY;
	}

	public void setPERSON_ADDRESSID(String pERSON_ADDRESSID) {
		PERSON_ADDRESSID = pERSON_ADDRESSID;
	}

	public void setPERSON_SERPOLICY(String pERSON_SERPOLICY) {
		PERSON_SERPOLICY = pERSON_SERPOLICY;
	}

	public void setPERSON_NUMPOLICY(String pERSON_NUMPOLICY) {
		PERSON_NUMPOLICY = pERSON_NUMPOLICY;
	}

	public void setPERSON_SEX(String pERSON_SEX) {
		PERSON_SEX = pERSON_SEX;
	}

	public void setPERSON_SERDOC(String pERSON_SERDOC) {
		PERSON_SERDOC = pERSON_SERDOC;
	}

	public void setPERSON_NUMDOC(String pERSON_NUMDOC) {
		PERSON_NUMDOC = pERSON_NUMDOC;
	}

	public void setPERSON_REGNUMBER(String pERSON_REGNUMBER) {
		PERSON_REGNUMBER = pERSON_REGNUMBER;
	}

	public void setPERSON_LINKSMOESTABLISHMENTID(
			String pERSON_LINKSMOESTABLISHMENTID) {
		PERSON_LINKSMOESTABLISHMENTID = pERSON_LINKSMOESTABLISHMENTID;
	}

	public void setPERSON_ESTABLISHMENTAMBUL(String pERSON_ESTABLISHMENTAMBUL) {
		PERSON_ESTABLISHMENTAMBUL = pERSON_ESTABLISHMENTAMBUL;
	}

	public void setPERSON_DATECHANGE(String pERSON_DATECHANGE) {
		PERSON_DATECHANGE = pERSON_DATECHANGE;
	}

	public void setPERSON_ESTABLISHMENTDENT(String pERSON_ESTABLISHMENTDENT) {
		PERSON_ESTABLISHMENTDENT = pERSON_ESTABLISHMENTDENT;
	}

	public void setPERSON_SOCIALID(String pERSON_SOCIALID) {
		PERSON_SOCIALID = pERSON_SOCIALID;
	}

	public void setPERSON_STATUSID(String pERSON_STATUSID) {
		PERSON_STATUSID = pERSON_STATUSID;
	}

	public void setPERSON_DOCPERSONID(String pERSON_DOCPERSONID) {
		PERSON_DOCPERSONID = pERSON_DOCPERSONID;
	}

	public void setPERSON_INSPECTION(String pERSON_INSPECTION) {
		PERSON_INSPECTION = pERSON_INSPECTION;
	}

	public void setPERSON_OPERATION(String pERSON_OPERATION) {
		PERSON_OPERATION = pERSON_OPERATION;
	}

	public void setPERSON_STATUSREC(String pERSON_STATUSREC) {
		PERSON_STATUSREC = pERSON_STATUSREC;
	}

	public void setPERSON_OUTID(String pERSON_OUTID) {
		PERSON_OUTID = pERSON_OUTID;
	}

	public void setPERSON_INSPECTORID(String pERSON_INSPECTORID) {
		PERSON_INSPECTORID = pERSON_INSPECTORID;
	}

	public void setPERSON_ESTABLISHMENTID(String pERSON_ESTABLISHMENTID) {
		PERSON_ESTABLISHMENTID = pERSON_ESTABLISHMENTID;
	}

	public void setPERSON_DATEPOLICY(String pERSON_DATEPOLICY) {
		PERSON_DATEPOLICY = pERSON_DATEPOLICY;
	}

	public void setPERSON_DATEINPUT(String pERSON_DATEINPUT) {
		PERSON_DATEINPUT = pERSON_DATEINPUT;
	}

	public void setENP_IN(String eNP_IN) {
		ENP_IN = eNP_IN;
	}

	public void setSMO_OLD(String sMO_OLD) {
		SMO_OLD = sMO_OLD;
	}

	public void setPERSONADD_ADDRESSID(String pERSONADD_ADDRESSID) {
		PERSONADD_ADDRESSID = pERSONADD_ADDRESSID;
	}

	public void setPERSONADD_PRIM(String pERSONADD_PRIM) {
		PERSONADD_PRIM = pERSONADD_PRIM;
	}

	public void setSNILS(String sNILS) {
		SNILS = sNILS;
	}

	public void setBORN(String bORN) {
		BORN = bORN;
	}

	public void setDATEPASSPORT(String dATEPASSPORT) {
		DATEPASSPORT = dATEPASSPORT;
	}

	public void setRUSSIAN(String rUSSIAN) {
		RUSSIAN = rUSSIAN;
	}

	public void setTELEDOM(String tELEDOM) {
		TELEDOM = tELEDOM;
	}

	public void setTELEWORK(String tELEWORK) {
		TELEWORK = tELEWORK;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public void setTELE2(String tELE2) {
		TELE2 = tELE2;
	}

	public void setDOK_VI(String dOK_VI) {
		DOK_VI = dOK_VI;
	}

	public void setENP(String eNP) {
		ENP = eNP;
	}

	public void setZA(String zA) {
		ZA = zA;
	}

	public void setZAD(String zAD) {
		ZAD = zAD;
	}

	public void setZAP(String zAP) {
		ZAP = zAP;
	}

	public void setPRED(String pRED) {
		PRED = pRED;
	}

	public void setD_V(String d_V) {
		D_V = d_V;
	}

	public void setD_SER(String d_SER) {
		D_SER = d_SER;
	}

	public void setD_NUM(String d_NUM) {
		D_NUM = d_NUM;
	}

	public void setD_DATE(String d_DATE) {
		D_DATE = d_DATE;
	}

	public void setMETHOD(String mETHOD) {
		METHOD = mETHOD;
	}

	public void setPETITION(String pETITION) {
		PETITION = pETITION;
	}

	public void setFPOLIC(String fPOLIC) {
		FPOLIC = fPOLIC;
	}

	public void setPR_FAM(String pR_FAM) {
		PR_FAM = pR_FAM;
	}

	public void setPR_IM(String pR_IM) {
		PR_IM = pR_IM;
	}

	public void setPR_OT(String pR_OT) {
		PR_OT = pR_OT;
	}

	public void setPR_TEL(String pR_TEL) {
		PR_TEL = pR_TEL;
	}

	public void setPR_ADRES(String pR_ADRES) {
		PR_ADRES = pR_ADRES;
	}

	public void setVS_NUM(String vS_NUM) {
		VS_NUM = vS_NUM;
	}

	public void setVS_DATE(String vS_DATE) {
		VS_DATE = vS_DATE;
	}

	public void setD1(String d1) {
		D1 = d1;
	}

	public void setD2(String d2) {
		D2 = d2;
	}

	public void setENP_DATE(String eNP_DATE) {
		ENP_DATE = eNP_DATE;
	}

	public void setLAST_FAM(String lAST_FAM) {
		LAST_FAM = lAST_FAM;
	}

	public void setLAST_IM(String lAST_IM) {
		LAST_IM = lAST_IM;
	}

	public void setLAST_OT(String lAST_OT) {
		LAST_OT = lAST_OT;
	}

	public void setLAST_DR(String lAST_DR) {
		LAST_DR = lAST_DR;
	}

	@Id
    @Column(name="ENP_CALC")
    public String getENP_CALC(){
        return ENP_CALC;
    }
    
    public void setENP_CALC(String ENP_CALC){
    	this.ENP_CALC = ENP_CALC;     
    }
    @Column(name="ENP_OUTPUT")
	public String getENP_OUTPUT() {
		return ENP_OUTPUT;
	}
    @Column(name="DF")
	public String getDF() {
		return DF;
	}
    @Column(name="PACK_ID")
	public String getPACK_ID() {
		return PACK_ID;
	}
    @Column(name="STATUS")
	public String getSTATUS() {
		return STATUS;
	}
    @Column(name="GD")
	public String getGD() {
		return GD;
	}
    @Column(name="ENP_FFOMS")
	public String getENP_FFOMS() {
		return ENP_FFOMS;
	}
    @Column(name="OKATO_FFOMS")
	public String getOKATO_FFOMS() {
		return OKATO_FFOMS;
	}
    @Column(name="PRIM")
	public String getPRIM() {
		return PRIM;
	}
    @Column(name="TAG")
	public String getTAG() {
		return TAG;
	}
    @Column(name="ERR")
	public String getERR() {
		return ERR;
	}
    @Column(name="PERSON_SURNAME")
	public String getPERSON_SURNAME() {
		return PERSON_SURNAME;
	}
    @Column(name="PERSON_KINDFIRSTNAME")
	public String getPERSON_KINDFIRSTNAME() {
		return PERSON_KINDFIRSTNAME;
	}
    @Column(name="PERSON_KINDLASTNAME")
	public String getPERSON_KINDLASTNAME() {
		return PERSON_KINDLASTNAME;
	}
    @Column(name="PERSON_BIRTHDAY")
	public String getPERSON_BIRTHDAY() {
		return PERSON_BIRTHDAY;
	}
    @Column(name="PERSON_ADDRESSID")
	public String getPERSON_ADDRESSID() {
		return PERSON_ADDRESSID;
	}
    @Column(name="PERSON_SERPOLICY")
	public String getPERSON_SERPOLICY() {
		return PERSON_SERPOLICY;
	}
    @Column(name="PERSON_NUMPOLICY")
	public String getPERSON_NUMPOLICY() {
		return PERSON_NUMPOLICY;
	}
    @Column(name="PERSON_SEX")
	public String getPERSON_SEX() {
		return PERSON_SEX;
	}
    @Column(name="PERSON_SERDOC")
	public String getPERSON_SERDOC() {
		return PERSON_SERDOC;
	}
    @Column(name="PERSON_NUMDOC")
	public String getPERSON_NUMDOC() {
		return PERSON_NUMDOC;
	}
    @Column(name="PERSON_REGNUMBER")
	public String getPERSON_REGNUMBER() {
		return PERSON_REGNUMBER;
	}
    @Column(name="PERSON_LINKSMOESTABLISHMENTID")
	public String getPERSON_LINKSMOESTABLISHMENTID() {
		return PERSON_LINKSMOESTABLISHMENTID;
	}
    @Column(name="PERSON_ESTABLISHMENTAMBUL")
	public String getPERSON_ESTABLISHMENTAMBUL() {
		return PERSON_ESTABLISHMENTAMBUL;
	}
    @Column(name="PERSON_DATECHANGE")
	public String getPERSON_DATECHANGE() {
		return PERSON_DATECHANGE;
	}
    @Column(name="PERSON_ESTABLISHMENTDENT")
	public String getPERSON_ESTABLISHMENTDENT() {
		return PERSON_ESTABLISHMENTDENT;
	}
    @Column(name="PERSON_SOCIALID")
	public String getPERSON_SOCIALID() {
		return PERSON_SOCIALID;
	}
    @Column(name="PERSON_STATUSID")
	public String getPERSON_STATUSID() {
		return PERSON_STATUSID;
	}
    @Column(name="PERSON_DOCPERSONID")
	public String getPERSON_DOCPERSONID() {
		return PERSON_DOCPERSONID;
	}
    @Column(name="PERSON_INSPECTION")
	public String getPERSON_INSPECTION() {
		return PERSON_INSPECTION;
	}
    @Column(name="PERSON_OPERATION")
	public String getPERSON_OPERATION() {
		return PERSON_OPERATION;
	}
    @Column(name="PERSON_STATUSREC")
	public String getPERSON_STATUSREC() {
		return PERSON_STATUSREC;
	}
    @Column(name="PERSON_OUTID")
	public String getPERSON_OUTID() {
		return PERSON_OUTID;
	}
    @Column(name="PERSON_INSPECTORID")
	public String getPERSON_INSPECTORID() {
		return PERSON_INSPECTORID;
	}
    @Column(name="PERSON_ESTABLISHMENTID")
	public String getPERSON_ESTABLISHMENTID() {
		return PERSON_ESTABLISHMENTID;
	}
    @Column(name="PERSON_DATEPOLICY")
	public String getPERSON_DATEPOLICY() {
		return PERSON_DATEPOLICY;
	}
    @Column(name="PERSON_DATEINPUT")
	public String getPERSON_DATEINPUT() {
		return PERSON_DATEINPUT;
	}
    @Column(name="ENP_IN")
	public String getENP_IN() {
		return ENP_IN;
	}
    @Column(name="SMO_OLD")
	public String getSMO_OLD() {
		return SMO_OLD;
	}
    @Column(name="PERSONADD_ADDRESSID")
	public String getPERSONADD_ADDRESSID() {
		return PERSONADD_ADDRESSID;
	}
    @Column(name="PERSONADD_PRIM")
	public String getPERSONADD_PRIM() {
		return PERSONADD_PRIM;
	}
    @Column(name="SNILS")
	public String getSNILS() {
		return SNILS;
	}
    @Column(name="BORN")
	public String getBORN() {
		return BORN;
	}
    @Column(name="DATEPASSPORT")
	public String getDATEPASSPORT() {
		return DATEPASSPORT;
	}
    @Column(name="RUSSIAN")
	public String getRUSSIAN() {
		return RUSSIAN;
	}
    @Column(name="TELEDOM")
	public String getTELEDOM() {
		return TELEDOM;
	}
    @Column(name="TELEWORK")
	public String getTELEWORK() {
		return TELEWORK;
	}
    @Column(name="EMAIL")
	public String getEMAIL() {
		return EMAIL;
	}
    @Column(name="TELE2")
	public String getTELE2() {
		return TELE2;
	}
    @Column(name="DOK_VI")
	public String getDOK_VI() {
		return DOK_VI;
	}
    @Column(name="ENP")
	public String getENP() {
		return ENP;
	}
    @Column(name="ZA")
	public String getZA() {
		return ZA;
	}
    @Column(name="ZAD")
	public String getZAD() {
		return ZAD;
	}
    @Column(name="ZAP")
	public String getZAP() {
		return ZAP;
	}
    @Column(name="PRED")
	public String getPRED() {
		return PRED;
	}
    @Column(name="D_V")
	public String getD_V() {
		return D_V;
	}
    @Column(name="D_SER")
	public String getD_SER() {
		return D_SER;
	}
    @Column(name="D_NUM")
	public String getD_NUM() {
		return D_NUM;
	}
    @Column(name="D_DATE")
	public String getD_DATE() {
		return D_DATE;
	}
    @Column(name="METHOD")
	public String getMETHOD() {
		return METHOD;
	}
    @Column(name="PETITION")
	public String getPETITION() {
		return PETITION;
	}
    @Column(name="FPOLIC")
	public String getFPOLIC() {
		return FPOLIC;
	}
    @Column(name="PR_FAM")
	public String getPR_FAM() {
		return PR_FAM;
	}
    @Column(name="PR_IM")
	public String getPR_IM() {
		return PR_IM;
	}
    @Column(name="PR_OT")
	public String getPR_OT() {
		return PR_OT;
	}
    @Column(name="PR_TEL")
	public String getPR_TEL() {
		return PR_TEL;
	}
    @Column(name="PR_ADRES")
	public String getPR_ADRES() {
		return PR_ADRES;
	}
    @Column(name="VS_NUM")
	public String getVS_NUM() {
		return VS_NUM;
	}
    @Column(name="VS_DATE")
	public String getVS_DATE() {
		return VS_DATE;
	}
    @Column(name="D1")
	public String getD1() {
		return D1;
	}
    @Column(name="D2")
	public String getD2() {
		return D2;
	}
    @Column(name="ENP_DATE")
	public String getENP_DATE() {
		return ENP_DATE;
	}
    @Column(name="LAST_FAM")
	public String getLAST_FAM() {
		return LAST_FAM;
	}
    @Column(name="LAST_IM")
	public String getLAST_IM() {
		return LAST_IM;
	}
    @Column(name="LAST_OT")
	public String getLAST_OT() {
		return LAST_OT;
	}
    @Column(name="LAST_DR")
	public String getLAST_DR() {
		return LAST_DR;
	}
 
}