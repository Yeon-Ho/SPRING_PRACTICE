package common.exception;

// 상수를 효율적으로 다루기 위해서 자바 1.5버전부터 추가됨
// 코드(에러 코드, 상태 코드, 등급 코드 등)를 다루기 위해 주로 사용됨
// 코드와 연관된 데이터들을 일괄적으로 다룰 수 있다.
public enum ErrorCode {

	// 메일 에러코드 등록
	M_ERROR_01("메일 전송 중 에러가 발생하였습니다.", "join.do"),
	F_ERROR_02("파일 등록 중 에러가 발생하였습니다.", "noticelist.do");
	
	private final String MESSAGE;
	private final String URL;

	ErrorCode(String msg, String url) {
		this.MESSAGE = msg;
		this.URL = url;
	}

	public String getMESSAGE() {
		return MESSAGE;
	}
	public String getURL() {
		return URL;
	}
	
}
