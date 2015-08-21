package com.spring.login.vo;

public class userPassVO {
	private String userId;			//사용자 아이디 		NLL
	private String regNo;           //주민등록번호
	private String comNo;           //사업자등록번호
	private String orgCd;           //조직코드(학교코드)
	private String empNo;           //사원번호
	private String nmKor;           //성명(한글)			NLL
	private String stateFlag;       //가입/탈퇴 구분
	private String orgFlag;         //개인/기관 구분
	private String levelCd;         //사용자 등급코드
	private String kindCd;          //사용자 구분코드
	private String typeCd;          //사용자 유형코드
	private String gradeCd;         //등급코드
	private String langKnd;         //사용자로케일
	private String themeId;         //사용자 테마 아이디
	private String mailFlag;        //전자우편 사용유무
	private String blogFlag;        //블로그 사용유무
	private String memoFlag;        //쪽지 사용유무
	private String diskFlag;        //웹디스크 사용유무
	private String chatFlag;        //채팅 사용유무
	private String rcmdUserId;      //추천인 아이디
	private String mileTot;         //마일리지 총계
	private String nmChr;           //성명(한자)
	private String nmEng;           //성명(영어)
	private String nmNic;           //닉네임
	private String sexFlag;         //성별 구분
	private String bloodType;       //혈액형
	private String homeTel;         //집 전화번호
	private String offcTel;         //사무실 전화번호
	private String mobileTel;       //이동 전화번호
	private String faxNo;           //팩스번호
	private String birthYmd;        //생년월일
	private String luorsunFlag;     //음양 구분
	private String marryYmd;        //결혼 년월일
	private String emailAddr;       //전자우편 주소
	private String openFlag;        //공개/비공개 구분
	private String homeZip;         //집 우편번호
	private String homeAddr1;       //집 주소1
	private String homeAddr2;       //집 주소2
	private String offcZip;         //사무실 우편번호
	private String offcAddr1;       //사무실 주소1
	private String offcAddr2;       //사무실 주소2
	private String userIcon;        //사용자아이콘
	private String userInfo01;      //사용자정보01
	private String userInfo02;      //사용자정보02
	private String userInfo03;      //사용자정보03
	private String userInfo04;      //사용자정보04
	private String userInfo05;      //비밀번호
	private String userInfo06;      //사용자정보06
	private String userInfo07;      //사용자정보07
	private String userInfo08;      //사용자정보08
	private String userInfo09;      //사용자정보09
	private String userInfo10;      //사용자정보10
	private String lastLogon;       //마지막 접속일시
	private String lastIp;          //마지막 접속 CLIENT IP
	private String regDatim;        //등록 일시
	private String updUserId;       //수정자 아이디
	private String updDatim;        //수정 일시
	private String page1stFlag;     //로그인후 첫페이지 설정구분
	private String page1stUrl;      //로그인후 첫페이지 URL
	private String picPath;         //사진파일 위치
	private String intro;           //자기소개
	private String updateRequired;  //수정필요여부
	private String phoneType;       //전화번호타입
	private String deviceId;        //디바이스ID
	private String pushToken;       //푸시토큰

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getComNo() {
		return comNo;
	}

	public void setComNo(String comNo) {
		this.comNo = comNo;
	}

	public String getOrgCd() {
		return orgCd;
	}

	public void setOrgCd(String orgCd) {
		this.orgCd = orgCd;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getNmKor() {
		return nmKor;
	}

	public void setNmKor(String nmKor) {
		this.nmKor = nmKor;
	}

	public String getStateFlag() {
		return stateFlag;
	}

	public void setStateFlag(String stateFlag) {
		this.stateFlag = stateFlag;
	}

	public String getOrgFlag() {
		return orgFlag;
	}

	public void setOrgFlag(String orgFlag) {
		this.orgFlag = orgFlag;
	}

	public String getLevelCd() {
		return levelCd;
	}

	public void setLevelCd(String levelCd) {
		this.levelCd = levelCd;
	}

	public String getKindCd() {
		return kindCd;
	}

	public void setKindCd(String kindCd) {
		this.kindCd = kindCd;
	}

	public String getTypeCd() {
		return typeCd;
	}

	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}

	public String getGradeCd() {
		return gradeCd;
	}

	public void setGradeCd(String gradeCd) {
		this.gradeCd = gradeCd;
	}

	public String getLangKnd() {
		return langKnd;
	}

	public void setLangKnd(String langKnd) {
		this.langKnd = langKnd;
	}

	public String getThemeId() {
		return themeId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

	public String getMailFlag() {
		return mailFlag;
	}

	public void setMailFlag(String mailFlag) {
		this.mailFlag = mailFlag;
	}

	public String getBlogFlag() {
		return blogFlag;
	}

	public void setBlogFlag(String blogFlag) {
		this.blogFlag = blogFlag;
	}

	public String getMemoFlag() {
		return memoFlag;
	}

	public void setMemoFlag(String memoFlag) {
		this.memoFlag = memoFlag;
	}

	public String getDiskFlag() {
		return diskFlag;
	}

	public void setDiskFlag(String diskFlag) {
		this.diskFlag = diskFlag;
	}

	public String getChatFlag() {
		return chatFlag;
	}

	public void setChatFlag(String chatFlag) {
		this.chatFlag = chatFlag;
	}

	public String getRcmdUserId() {
		return rcmdUserId;
	}

	public void setRcmdUserId(String rcmdUserId) {
		this.rcmdUserId = rcmdUserId;
	}

	public String getMileTot() {
		return mileTot;
	}

	public void setMileTot(String mileTot) {
		this.mileTot = mileTot;
	}

	public String getNmChr() {
		return nmChr;
	}

	public void setNmChr(String nmChr) {
		this.nmChr = nmChr;
	}

	public String getNmEng() {
		return nmEng;
	}

	public void setNmEng(String nmEng) {
		this.nmEng = nmEng;
	}

	public String getNmNic() {
		return nmNic;
	}

	public void setNmNic(String nmNic) {
		this.nmNic = nmNic;
	}

	public String getSexFlag() {
		return sexFlag;
	}

	public void setSexFlag(String sexFlag) {
		this.sexFlag = sexFlag;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getHomeTel() {
		return homeTel;
	}

	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel;
	}

	public String getOffcTel() {
		return offcTel;
	}

	public void setOffcTel(String offcTel) {
		this.offcTel = offcTel;
	}

	public String getMobileTel() {
		return mobileTel;
	}

	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getBirthYmd() {
		return birthYmd;
	}

	public void setBirthYmd(String birthYmd) {
		this.birthYmd = birthYmd;
	}

	public String getLuorsunFlag() {
		return luorsunFlag;
	}

	public void setLuorsunFlag(String luorsunFlag) {
		this.luorsunFlag = luorsunFlag;
	}

	public String getMarryYmd() {
		return marryYmd;
	}

	public void setMarryYmd(String marryYmd) {
		this.marryYmd = marryYmd;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getOpenFlag() {
		return openFlag;
	}

	public void setOpenFlag(String openFlag) {
		this.openFlag = openFlag;
	}

	public String getHomeZip() {
		return homeZip;
	}

	public void setHomeZip(String homeZip) {
		this.homeZip = homeZip;
	}

	public String getHomeAddr1() {
		return homeAddr1;
	}

	public void setHomeAddr1(String homeAddr1) {
		this.homeAddr1 = homeAddr1;
	}

	public String getHomeAddr2() {
		return homeAddr2;
	}

	public void setHomeAddr2(String homeAddr2) {
		this.homeAddr2 = homeAddr2;
	}

	public String getOffcZip() {
		return offcZip;
	}

	public void setOffcZip(String offcZip) {
		this.offcZip = offcZip;
	}

	public String getOffcAddr1() {
		return offcAddr1;
	}

	public void setOffcAddr1(String offcAddr1) {
		this.offcAddr1 = offcAddr1;
	}

	public String getOffcAddr2() {
		return offcAddr2;
	}

	public void setOffcAddr2(String offcAddr2) {
		this.offcAddr2 = offcAddr2;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public String getUserInfo01() {
		return userInfo01;
	}

	public void setUserInfo01(String userInfo01) {
		this.userInfo01 = userInfo01;
	}

	public String getUserInfo02() {
		return userInfo02;
	}

	public void setUserInfo02(String userInfo02) {
		this.userInfo02 = userInfo02;
	}

	public String getUserInfo03() {
		return userInfo03;
	}

	public void setUserInfo03(String userInfo03) {
		this.userInfo03 = userInfo03;
	}

	public String getUserInfo04() {
		return userInfo04;
	}

	public void setUserInfo04(String userInfo04) {
		this.userInfo04 = userInfo04;
	}

	public String getUserInfo05() {
		return userInfo05;
	}

	public void setUserInfo05(String userInfo05) {
		this.userInfo05 = userInfo05;
	}

	public String getUserInfo06() {
		return userInfo06;
	}

	public void setUserInfo06(String userInfo06) {
		this.userInfo06 = userInfo06;
	}

	public String getUserInfo07() {
		return userInfo07;
	}

	public void setUserInfo07(String userInfo07) {
		this.userInfo07 = userInfo07;
	}

	public String getUserInfo08() {
		return userInfo08;
	}

	public void setUserInfo08(String userInfo08) {
		this.userInfo08 = userInfo08;
	}

	public String getUserInfo09() {
		return userInfo09;
	}

	public void setUserInfo09(String userInfo09) {
		this.userInfo09 = userInfo09;
	}

	public String getUserInfo10() {
		return userInfo10;
	}

	public void setUserInfo10(String userInfo10) {
		this.userInfo10 = userInfo10;
	}

	public String getLastLogon() {
		return lastLogon;
	}

	public void setLastLogon(String lastLogon) {
		this.lastLogon = lastLogon;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public String getRegDatim() {
		return regDatim;
	}

	public void setRegDatim(String regDatim) {
		this.regDatim = regDatim;
	}

	public String getUpdUserId() {
		return updUserId;
	}

	public void setUpdUserId(String updUserId) {
		this.updUserId = updUserId;
	}

	public String getUpdDatim() {
		return updDatim;
	}

	public void setUpdDatim(String updDatim) {
		this.updDatim = updDatim;
	}

	public String getPage1stFlag() {
		return page1stFlag;
	}

	public void setPage1stFlag(String page1stFlag) {
		this.page1stFlag = page1stFlag;
	}

	public String getPage1stUrl() {
		return page1stUrl;
	}

	public void setPage1stUrl(String page1stUrl) {
		this.page1stUrl = page1stUrl;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getUpdateRequired() {
		return updateRequired;
	}

	public void setUpdateRequired(String updateRequired) {
		this.updateRequired = updateRequired;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getPushToken() {
		return pushToken;
	}

	public void setPushToken(String pushToken) {
		this.pushToken = pushToken;
	}

}
