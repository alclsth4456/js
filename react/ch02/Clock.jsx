import React from "react";

function Clock(props) {
  return (
    <div>
      <h1>React!!</h1>
      <h2>now Time: {new Date().toLocaleTimeString()}</h2>
    </div>
  );
}

export default Clock;
