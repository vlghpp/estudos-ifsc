import { FaStar } from 'react-icons/fa'

export default function Star({ selected = false, onSelect }){
    return (
        <FaStar color={ selected ? 'yellow' : 'grey' } onClick={onSelect}></FaStar>
    )
}