package ch07_collection.crudmember;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    private List<Member> memberList = null;

    public MemberDao(){
        this.memberList = new ArrayList<Member>();
    }

    // 추가
    public int insertData(Member member){
        this.memberList.add(member);
        System.out.println("아이디 " + member.getId() + "가 추가됩니다.");
        return 1;
    }

    public int getSize(){
        return memberList.size();
    }

    public List<Member> selectAll(){
        return memberList;
    }

    public Member getOne(String findId){
        Member who = null;

        for(Member bean:memberList){
            if(findId == bean.getId()){
                who = bean;
                break;
            }
        }

        return who;
    }

    public int deleteData(String deleteId) {
        int cnt = -1;

        for(Member bean:memberList){
            if(deleteId.equals(bean.getId())){ // 참고자료형일 경우 비교는 equals 사용하면 됨
                this.memberList.remove(deleteId);
                cnt = 1;
                break;
            }
        }
        /*
        for(Member bean:memberList){
            if(bean.getId() == deleteId){ // ==는 사용하지 마셈 -> why?
                this.memberList.remove(deleteId);
                cnt = 1;
            }
        }
        */
        return cnt;
    }

    public void deleteAllData(){
        this.memberList.clear();
    }
}
