package com.doubles.ex05.service;

import com.doubles.ex05.domain.ReplyVO;

import java.util.List;

public interface ReplyService {

    // 댓글 목록
    public List<ReplyVO> list(Integer bno) throws Exception;

    // 댓글 입력
    public void addReply(ReplyVO replyVO) throws Exception;

    // 댓글 수정
    public void modifyReply(ReplyVO replyVO) throws Exception;

    // 댓글 삭제
    public void removeReply(Integer rno) throws Exception;

}