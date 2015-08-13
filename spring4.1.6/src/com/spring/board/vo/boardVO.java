package com.spring.board.vo;

public class boardVO {

	private String boardId;       //게시판 아이디
	private String boardRid;      //실게시판 아이디
	private int domainId;      //도메인ID
	private String boardActive;   //게시판 사용여부
	private String boardSys;      //게시판사용 시스템코드
	
	private String owntblYn;      //독립형 여부
	private String owntblGix;     //독립테이블어근명
	private String boardType;     //게시판 유형
	private String mergeType;     //통합게시판 유형
	private String funcYns;       //기본기능 사용여부
	
	private String bugaYns;       //부가기능 사용여부
	private String listYns;       //목록기능 사용여부
	private String readYns;       //읽기기능 사용여부
	private String srchYns;       //검색기능 사용여부
	private String ttlYns;        //타이틀 표시여부
	
	private String ttlLens;       //타이틀 길이
	private String termFlag;      //게시기간 지정유형
	private String boardSkin;     //스킨
	private String raiseColor;    //인기게시물 색깔
	private String raiseCnt;      //인기게시물 기준 조회건수
	
	private String newTerm;       //최신글 기준 경과시간
	private String maxFileCnt;    //최대 첨부파일 수
	private String maxFileSize;   //최대 첨부파일 크기
	private String maxFileDown;   //최대 첨부파일 다운로드 횟수
	private String listSetCnt;    //한 화면 목록 수
	
	private String badStdCnt;     //악플 처리 기준 수
	private String miniTrgtWin;   //미니보드 타겟 WINDOW
	private String miniTrgtUrl;   //미니보드 타겟 URL
	private String extnClassNm;   //확장필드 클래스
	private String boardWidth;    //게시판 넓이
	
	private String topHtml;       //상단 HTML
	private String bottomHtml;    //하단 HTML
	private String boardBgPic;    //배경 그림
	private String boardBgColor;  //배경 색
	private String updUserId;     //최종 수정자
	
	private String updDatim;      //최종 수정일시

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getBoardRid() {
		return boardRid;
	}

	public void setBoardRid(String boardRid) {
		this.boardRid = boardRid;
	}

	public int getDomainId() {
		return domainId;
	}

	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}

	public String getBoardActive() {
		return boardActive;
	}

	public void setBoardActive(String boardActive) {
		this.boardActive = boardActive;
	}

	public String getBoardSys() {
		return boardSys;
	}

	public void setBoardSys(String boardSys) {
		this.boardSys = boardSys;
	}

	public String getOwntblYn() {
		return owntblYn;
	}

	public void setOwntblYn(String owntblYn) {
		this.owntblYn = owntblYn;
	}

	public String getOwntblGix() {
		return owntblGix;
	}

	public void setOwntblGix(String owntblGix) {
		this.owntblGix = owntblGix;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getMergeType() {
		return mergeType;
	}

	public void setMergeType(String mergeType) {
		this.mergeType = mergeType;
	}

	public String getFuncYns() {
		return funcYns;
	}

	public void setFuncYns(String funcYns) {
		this.funcYns = funcYns;
	}

	public String getBugaYns() {
		return bugaYns;
	}

	public void setBugaYns(String bugaYns) {
		this.bugaYns = bugaYns;
	}

	public String getListYns() {
		return listYns;
	}

	public void setListYns(String listYns) {
		this.listYns = listYns;
	}

	public String getReadYns() {
		return readYns;
	}

	public void setReadYns(String readYns) {
		this.readYns = readYns;
	}

	public String getSrchYns() {
		return srchYns;
	}

	public void setSrchYns(String srchYns) {
		this.srchYns = srchYns;
	}

	public String getTtlYns() {
		return ttlYns;
	}

	public void setTtlYns(String ttlYns) {
		this.ttlYns = ttlYns;
	}

	public String getTtlLens() {
		return ttlLens;
	}

	public void setTtlLens(String ttlLens) {
		this.ttlLens = ttlLens;
	}

	public String getTermFlag() {
		return termFlag;
	}

	public void setTermFlag(String termFlag) {
		this.termFlag = termFlag;
	}

	public String getBoardSkin() {
		return boardSkin;
	}

	public void setBoardSkin(String boardSkin) {
		this.boardSkin = boardSkin;
	}

	public String getRaiseColor() {
		return raiseColor;
	}

	public void setRaiseColor(String raiseColor) {
		this.raiseColor = raiseColor;
	}

	public String getRaiseCnt() {
		return raiseCnt;
	}

	public void setRaiseCnt(String raiseCnt) {
		this.raiseCnt = raiseCnt;
	}

	public String getNewTerm() {
		return newTerm;
	}

	public void setNewTerm(String newTerm) {
		this.newTerm = newTerm;
	}

	public String getMaxFileCnt() {
		return maxFileCnt;
	}

	public void setMaxFileCnt(String maxFileCnt) {
		this.maxFileCnt = maxFileCnt;
	}

	public String getMaxFileSize() {
		return maxFileSize;
	}

	public void setMaxFileSize(String maxFileSize) {
		this.maxFileSize = maxFileSize;
	}

	public String getMaxFileDown() {
		return maxFileDown;
	}

	public void setMaxFileDown(String maxFileDown) {
		this.maxFileDown = maxFileDown;
	}

	public String getListSetCnt() {
		return listSetCnt;
	}

	public void setListSetCnt(String listSetCnt) {
		this.listSetCnt = listSetCnt;
	}

	public String getBadStdCnt() {
		return badStdCnt;
	}

	public void setBadStdCnt(String badStdCnt) {
		this.badStdCnt = badStdCnt;
	}

	public String getMiniTrgtWin() {
		return miniTrgtWin;
	}

	public void setMiniTrgtWin(String miniTrgtWin) {
		this.miniTrgtWin = miniTrgtWin;
	}

	public String getMiniTrgtUrl() {
		return miniTrgtUrl;
	}

	public void setMiniTrgtUrl(String miniTrgtUrl) {
		this.miniTrgtUrl = miniTrgtUrl;
	}

	public String getExtnClassNm() {
		return extnClassNm;
	}

	public void setExtnClassNm(String extnClassNm) {
		this.extnClassNm = extnClassNm;
	}

	public String getBoardWidth() {
		return boardWidth;
	}

	public void setBoardWidth(String boardWidth) {
		this.boardWidth = boardWidth;
	}

	public String getTopHtml() {
		return topHtml;
	}

	public void setTopHtml(String topHtml) {
		this.topHtml = topHtml;
	}

	public String getBottomHtml() {
		return bottomHtml;
	}

	public void setBottomHtml(String bottomHtml) {
		this.bottomHtml = bottomHtml;
	}

	public String getBoardBgPic() {
		return boardBgPic;
	}

	public void setBoardBgPic(String boardBgPic) {
		this.boardBgPic = boardBgPic;
	}

	public String getBoardBgColor() {
		return boardBgColor;
	}

	public void setBoardBgColor(String boardBgColor) {
		this.boardBgColor = boardBgColor;
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

}
