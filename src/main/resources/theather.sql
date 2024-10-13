create table theatre (
                         id int(15) not NULL auto_increment,
                         name varchar(255) not null,
                         troupe varchar(255) not null,
                         date timestamp,
                         total_tickets int,
                         free_tickets int,
                         primary key (id)
) engine = InnoDB default charset = UTF8;

insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('All for the game', 'FOX', '2024-08-30', 555,143);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Bones', 'FOX', '2024-07-21', 5495,12);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Blame it on my youth', 'Hyper', '2024-12-11', 555,143);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('My psychopath', 'Stray', '2024-08-01', 1423,11);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('For Better or Worse', 'FOX', '2024-09-27', 218,5);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Obsessed', 'Stray', '2024-02-01', 131,35);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Point nemo', 'Hyper', '2024-06-23', 546,22);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Trust me or not', 'Stray', '2024-03-22', 845,145);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Wreck my plans', 'FOX', '2024-03-11', 544,45);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('One way', 'Killers', '2024-05-23', 753,53);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('The real thing', 'Livers', '2024-01-09', 895,202);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('A quiet night', 'FOX', '2024-02-07', 743,3);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('A terrible story: he is dead', 'Stray', '2024-04-03', 745,77);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('A terrible story: he is a cat', 'Stray', '2024-08-30', 745,0);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Tokio hotel', 'FOX', '2024-05-24', 2210,54);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Let me go', 'Hyper', '2024-11-04', 543,63);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('I see no evil', 'Livers', '2024-04-28', 188,3);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Ember', 'FOX', '2024-02-26', 353,11);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Once more', 'FOX', '2024-08-01', 156,0);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Be my home', 'Hyper', '2024-02-07', 156,4);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Trigger', 'Stray', '2024-08-28', 987,45);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Phoenix', 'FOX', '2024-07-04',489,47);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Last chance', 'Hyper', '2024-06-26',498,12);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('The last of us', 'Livers', '2024-05-06', 2424,213);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Little star', 'FOX', '2024-12-25', 342,34);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Romeo and Juliet', 'Hyper', '2024-09-16', 653,63);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Macbeth', 'Stray', '2024-06-30', 899,145);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Julius Caesar', 'FOX', '2024-01-15', 1569,156);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Othello', 'Stray', '2024-09-07', 4952,15);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Hamlet', 'FOX', '2024-05-16', 546,3);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Inferno', 'Hyper', '2024-03-07', 4322,2);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Purgatorio', 'FOX', '2024-02-16', 345,6);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Mount Olympus', 'FOX', '2024-11-04', 384,33);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('(A)pollonia', 'FOX', '2024-05-21', 568, 48);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Cafe Müller', 'Hyper', '2024-05-24', 624,28);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Shakespeare’s Sonnets', 'FOX', '2024-07-28', 742,23);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Beuty and the beast', 'Hyper', '2024-04-21', 488,23);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Frozen', 'Livers', '2024-12-05', 253,2);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Frozen 2', 'FOX', '2024-07-23', 397,28);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Cinderella', 'Stray', '2024-04-26', 1894,32);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Rapunzel', 'Hyper', '2024-10-11',2456,143);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Papa', 'Livers', '2024-05-14', 1974,20);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Mick mouse', 'Hyper', '2024-06-17', 784,48);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('193587', 'FOX', '2024-02-28', 4824,12);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Mors per amorem', 'FOX', '2024-11-12', 584,14);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Pitter pen', 'FOX', '2024-04-09', 389, 4);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Adventure time', 'Livers', '2024-12-23', 718,98);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Power rangers', 'Livers', '2024-07-14', 5888,143);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Alice in the wonderland', 'Stray', '2024-08-30', 987,89);
insert into theatre (name,troupe,date,total_tickets,free_tickets) values ('Lady and the Tramp', 'Hyper', '2024-08-30', 897,68);
