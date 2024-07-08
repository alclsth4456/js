import React from "react";
import Comment from "./Comment";

const comments = [
  {
    name: "kimsojin",
    comment: "반갑습니다~ 리액트씨",
  },
  {
    name: "parkhongjin",
    comment: "리액트 장난아니군요!",
  },
];

function CommentList(props) {
  return (
    <div>
      {comments.map((comment) => {
        return <Comment name={comment.name} Comment={comment.comment} />;
      })}
    </div>
  );
}

export default CommentList;
