import React from "react";
import './Game.css';
export default function Game({game}) {
    return (
        <div className="game">
            <div className="game__title">{game.title}</div>
            <div className="game__developer">{game.developer}</div>
        </div>
    );
}