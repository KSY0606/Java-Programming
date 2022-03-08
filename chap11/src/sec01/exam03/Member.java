package sec01.exam03;

public class Member {

	public String id; // 필드 생성
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override  // 해시코드 재정의
	public int hashCode() {
		return id.hashCode();
	}
}
