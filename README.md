# Υπηρεσία δέσμευσης θέσεων στάθμευσης

Η υπηρεσία θα προσφέρει στους χρήστες της μειωμένο χρόνο αναζήτησης parking
σε πολυσύχναστες περιοχές. Θα είναι διαθέσιμη μόνο σε εγγεγραμμένους
χρήστες, επιτρέποντας σε ένα χρήστη να παραχωρήσει τη θέση παρκαρίσματος
του σε άλλο χρήστη του συστήματος που επιθυμεί να παρκάρει στην ίδια
περιοχή.

Κατά την εγγραφή τους στο σύστημα οι χρήστες καταχωρούν τα προσωπικά τους
στοιχεία καθώς και στοιχεία που αφορούν τα οχήματα που χρησιμοποιούν
(κυρίως χρώμα, μέγεθος, περιγραφή). Επιπλέον, όταν εγγράφεται κάποιος νέος χρήστης του δίνονται bonus 10 πιστωτικές μονάδες. Αν είναι ήδη εγγεγραμμένοι, βάζουν τα credentials τους, ενώ αν έχουν ξεχάσει τον κωδικό, θα τους αποστέλλετε e-mail ανάκτησης.

Ο χρήστης που πρόκειται να αφήσει τη
θέση parking δηλώνει τη διαθεσιμότητα της θέσης στάθμευσης παρέχοντας
διεύθυνση και ώρα κατά την οποία θα γίνει διαθέσιμη καθώς και το ποσό πιστωτικών μονάδων που θέλει για την ανταλλαγή. Οι χρήστες που
αναζητούν θέση στάθμευσης δηλώνουν την περιοχή και τον εκτιμώμενο χρόνο
άφιξής τους. Το σύστημα θα εμφανίζει ως αποτελέσματα αναζήτησης, θέσεις
στάθμευσης οι οποίες θα γίνουν διαθέσιμες μετά τον εκτιμώμενο χρόνο άφιξης
του χρήστη. Ο χρήστης θα επιλέγει την επιθυμητή θέση στάθμευσης και η
επιλογή του θα κοινοποιείται στον σταθμευμένο χρήστη. Ο σταθμευμένος
χρήστης αποδέχεται ή απορρίπτει το αίτημα ανάλογα με την αξιοπιστία του
αιτούντα (π.χ. αξιολόγηση, μέσος χρόνος καθυστέρησης).

Κατά την ανταλλαγή της θέσης στάθμευσης, όταν φτάσει ο χρήστης που επιθυμεί να παρκάρει, ο σταθμευμένος χρήστης εισάγει στο σύστημα κωδικό που του γνωστοποιεί ο χρήστης που
επιθυμεί να παρκάρει. Αυτό γίνεται για την αποφυγή λαθών κατά την εκτέλεση της εφαρμογής.
Η ανταλλαγή θέσης στάθμευσης συνοδεύεται με μεταφορά
πιστωτικών μονάδων προς το σταθμευμένο χρήστη από τον χρήστη που λαμβάνει
τη θέση στάθμευσης. Κάθε λεπτό καθυστέρησης στην ανταλλαγή της θέσης
στάθμευσης θα επιβαρύνει με επιπλέον πιστωτικές μονάδες(0.1 πιστωτικές μονάδες/λεπτό) τον χρήστη που
λαμβάνει. 

Ένας χρήστης που δεν έχει επαρκείς πιστωτικές μονάδες δεν μπορεί να
στείλει αιτήματα επιλογής θέσης στάθμευσης. Για αυτό υπάρχει η δυνατότητα επαναφόρτισης πιστωτικών μονάδων, με διάφορα οικονομικά πακέτα. Σε περίπτωση ψευδούς δήλωσης
θέσης στάθμευσης ο χρήστης που αναζητεί στάθμευση μπορεί να βαθμολογήσει
αρνητικά με thumbs down τον χρήστη που έκανε την ψευδή δήλωση. Αντίστοιχα, αν η ανταλλαγή ολοκληρωθεί με επιτυχία και μείνουν ευχαριστημένοι και οι 2 χρήστες μπορούν να βαθμολογήσουν ο ένας τον άλλον με thumbs up.

Το σύστημα θα παρέχει στην εταιρεία λειτουργίας της υπηρεσίας,  στατιστικά
στοιχεία σχετικά με ποσοστό επιτυχών σταθμεύσεων σε μηνιαία βάση και μέση
καθυστέρηση σε κάθε ανταλλαγή θέσεων πάρκινγκ.





