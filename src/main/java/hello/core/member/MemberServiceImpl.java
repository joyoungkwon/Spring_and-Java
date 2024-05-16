package hello.core.member;

public class MemberServiceImpl implements MemberService{



    private final MemberRepostitory memberRepostitory;

    public MemberServiceImpl(MemberRepostitory memberRepostitory) {
        this.memberRepostitory = memberRepostitory;
    }

    @Override
    public void join(Member member) {
        memberRepostitory.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepostitory.findById(memberId);
    }
/*
Test for method
* */
    public MemberRepostitory getMemberRepostitory() {
        return memberRepostitory;
    }
}
