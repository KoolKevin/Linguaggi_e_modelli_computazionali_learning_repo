## PUNTO DI PARTENZA | Linguaggi di programmazione di alto livello:
- Storicamente, lo strumento per far eseguire a un elaboratore le funzioni desiderate a un livello concettuale più elevato rispetto a quello permesso/indotto dall’hardware.
- Conseguenze/requisiti: promuovere una chiara e corretta impostazione dei problemi da risolvere demandando a opportuni TRADUTTORI (compilatori e interpreti) di colmare il divario con la macchina sottostante

### IL RUOLO DEL LINGUAGGIO
Risolvere coscientemente un problema implica sempre creare un modello della realtà
- Spesso il progettista segue, magari inconsciamente, metafore e concetti che derivano direttamente dal linguaggio di implementazione.
- La soluzione viene così pensata sui concetti di quello specifico linguaggio o di una categoria di linguaggi
    - Ad esempio, se il linguaggio di implementazione è il Pascal, difficilmente la soluzione sarà concepita usando concetti estranei al Pascal: come per esempio pipeline e processi
    - Usando il C l’uso di processi è invece più probabile, poiché il C è intrinsecamente più legato al sistema operativo e dunque il processo fa parte del suo insieme di concetti e metafore.
        
**PROBLEMA**: prendiamo come esempio i mattoncini del C (funzioni, typedef, ...) -> spesso sono troppo piccoli! Linguaggi ad oggetti offrono astrazioni di più alto livello, ma poi?

## SPAZIO CONCETTUALE DEI LINGUAGGI
L'insieme di metafore e concetti introdotti da un linguaggio (oltre alle regole sintattiche e semantiche) costituisce il suo spazio concettuale.
- alcuni concetti sono correlati all’ambiente che il linguaggio suppone esistere (file, processi, interfacce grafiche…)
- altri sono invece introdotti dal linguaggio stesso (funzioni, classi, oggetti, …)

Il diverso spazio concettuale di ogni linguaggio è la ragione di fondo per l’esistenza di tanti linguaggi
- un linguaggio può essere più adatto di un altro come strumento di lavoro o per problemi generici, o per uno specifico settore
- un linguaggio può esprimere meglio, grazie al suo spazio concettuale più ricco, le entità di un certo dominio applicativo

### MODELLO IMPERATIVO
Deriva direttamente dal modello di Von Neumann. NON scala bene all'aumentare della complessità. Funziona bene solo finchè si hanno problemi semplici (scomponibili in funzioni, cioè i mattoncini del C). Se mi  chiedono di progettare un sistema per le prenotazioni dei voli aree, non si riesce in questo modo ad avere un idea generale del sistema prima di iniziare a scasinare.

Linguaggi funzionali e Linguaggi logici al contrario partono da astrazioni logico-matematiche (Mattoni grossi).

### MODELLO DICHIARATIVO
Si danno le regole per computare, ma non si esplicita COME usarle. **SI DELEGA IL CONTROLLO**. Sotto necessitano di compilatori/interpreti più sofisticati rispetto ad una traduzione da istruzione complessa in tante istruzioni semplici.

**PROBLEMA**: Un approccio bottom-up al posto di un top-down :( 
- ossessione di avere CONTROLLO TOTALE
- il prezzo da pagare è dover pensare tutto nei minimi dettagli (mattoncini C)

### Linguaggi blended
Ogni paradigma ha il suo use-case!

Se devo fare dei calcoli il modello imperativo va anche bene. Se devo fare deduzioni a partire da delle regole? forse meglio un altro modello -> vedi prolog

    INTUIZIONE: Applicazioni multiparadigma? best of both worlds!

Le cose di basso livello si prestano bene al modello imperativo (una idea, un ordine). Al contrario, le cose di alto livello no (una idea diventa cento ordini)

    PROBLEMA: Cosa comporta far coesistere modelli computazionali diversi in una stessa applicazione? Non è immediato.