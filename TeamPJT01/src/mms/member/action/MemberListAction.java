package mms.member.action;
//7-2 회원등록 보기 요청 처리하는 Action 클래스 구현

import java.util.ArrayList;
import java.util.Scanner;


import mms.member.svc.MemberListService;
import mms.member.util.ConsoleUtil;
import mms.member.vo.Member;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		
		ConsoleUtil cu = new ConsoleUtil();
		MemberListService mls = new MemberListService();
		ArrayList<Member> amsave = new ArrayList<Member>();
		
		amsave = mls.getMemberList();
		cu.printMemberList(amsave);
		
	}

}
