import { useState } from "react";
import Star from "../Star";

export default function Rate(){
    const stars = [...new Array(5)];
    const [rate, setRate] = useState(0) 
    return (
        <div>
            {stars.map((_, i) => (
                <Star key={i} selected={rate > i} onSelect={() => {
                    setRate(i + 1)
                }}></Star>
            ))} 
        </div>
    )
}