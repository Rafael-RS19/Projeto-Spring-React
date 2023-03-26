import React, { useState, useEffect } from 'react';
import axios from 'axios';
import "./Contato.css"

function Contato() {
  const [data, setData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const result = await axios(
        'http://localhost:8080/agenda',
      );

      setData(result.data);
    };

    fetchData();
  }, []);

  return (
    <div>
      <h1>Usuários</h1>
      <h2>Contatos</h2>
      <ul>
        {data.map(user => (
          <li className='lista'>
            {user.nome} {user.idade} {user.email} {user.telefone} {user.endereco}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Contato;