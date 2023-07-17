import React, {useEffect, useState} from 'react';
import Networking from "./Networking";
import Game from "./Game";

import "./App.css";

export default function App() {
  const [games, setGames] = useState([]);
  const loadGames = () => {
    Networking.exec({
      endpoint: client => client.apis.games.getAll,
      success: result => setGames(result.body)
    });
  };
  useEffect(() => {
    loadGames();
  }, []);

  return (
      <div className="app">
        <h1>Games</h1>
        {games && games.map(it => <Game game={it} key={it.id}/>)}
      </div>
  );
}