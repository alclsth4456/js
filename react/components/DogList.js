import React from 'react';
import { Link } from 'react-router-dom';

const DogList = ({ dogs }) => {
  return (
    <div id="imgs">
      {dogs.map(dog => (
        <Link key={dog.id} to={`/dog/${dog.id}`}>
          <div className="dogs">
            <img src={dog.img} alt={dog.name} />
            <p>{dog.name}</p>
          </div>
        </Link>
      ))}
    </div>
  );
};

export default DogList;