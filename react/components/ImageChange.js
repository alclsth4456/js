import React,{useRef} from "react";

const ImageChange = ({imgSrcList})=> {
    const ref = useRef(null);

    const prevButton = ()=>{
        if(ref.current) ref.current.scrollLeft -= 200;
    }

    const nextButton = () => {
        if(ref.current) ref.current.scrollLeft += 200;
    }

    return (
        <div className="slider-container">
            <button onClick={prevButton} className="slider-button">
                &lt;
            </button>
            <div ref={ref} className="image-list">
                {imgSrcList.map((el,index)=> (
                    <img
                        key={index}
                        src={el}
                        className="slider-image"
                        alt={`Image ${index}`}
                    />    
                ))}
            </div>
            <button onClick={nextButton} className="slider-button">
                &gt;
            </button>
        </div>
    )
}

export default ImageChange;