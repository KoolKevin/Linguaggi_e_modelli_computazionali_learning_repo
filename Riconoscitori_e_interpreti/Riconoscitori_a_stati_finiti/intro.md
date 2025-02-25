### RICONOSCIBILITÀ DEI LINGUAGGI
I linguaggi generati da grammatiche di Tipo 0 possono in generale non essere riconoscibili (decidibili)
- Non è garantita l'esistenza di una MdT capace di decidere se una frase appartiene o meno al linguaggio

Al contrario, i linguaggi generati da grammatiche di Tipo 1 (e quindi di Tipo 2 e 3) sono riconoscibili
- Esiste sempre una MdT capace di decidere se una frase appartiene o meno al linguaggio
- **L'efficienza del processo di riconoscimento, però, è un'altra faccenda** …

Perché il riconoscitore di un linguaggio possa essere realizzato in modo **efficiente**, conviene adottare linguaggi generati da (classi speciali di)
grammatiche di Tipo 2
- Tutti i linguaggi di programmazione sono infatti context free
- Il riconoscitore prende il nome di PARSER

Per ottenere particolare efficienza in **sotto-parti di uso estremamente frequente**, si adottano spesso per esse linguaggi generati da
grammatiche di Tipo 3
- identificatori & numeri
- Il riconoscitore prende il nome di SCANNER (o lexer)