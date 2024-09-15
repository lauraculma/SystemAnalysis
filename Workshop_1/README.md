Motif Finder Project
This Java project generates DNA sequences, finds common motifs, and applies an entropy filter to remove sequences with low variability.

Features
DNA Sequence Generation:

The program generates random DNA sequences. The probabilities of each base (A, C, G, T) can be set as parameters.
Motif Search:

Finds and identifies the most common motif (a specific fragment of DNA) within the generated sequences. This is done using the MotifFinder class, which tracks motifs and counts their occurrences.
Entropy Filter:

Uses Shannon's theory to calculate the entropy of each sequence, allowing the removal of low-variability sequences and keeping only the more diverse ones.
Code Structure
MotifFinder: Finds the most frequent motif in the sequences.
FileReaderUtil: Reads the sequences from a text file.
EntropyFilter: Calculates the entropy of each sequence and filters out those that do not meet a minimum entropy level.
Motif: Generates DNA sequences with adjustable probabilities.
Launcher: The main class that runs the entire program (generates sequences, finds the motif, and applies the entropy filter).
Requirements
Java JDK 8 or higher.
A database.txt file where the generated sequences will be stored.
