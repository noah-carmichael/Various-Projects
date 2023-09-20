import random

import time

import os
os.environ['PYGAME_HIDE_SUPPORT_PROMPT'] = "hide"

import pygame

from pygame import mixer

import sys



#Instantiate mixer
mixer.init()

#Load audio file
mixer.music.load('intro.mp3')

#Set preferred volume
mixer.music.set_volume(0.2)

#Play the music
mixer.music.play(loops = -1)

print("loading game assets....")
print("\nWelcome to 'Deforestation but with Explosions, the Game!' This is a two person game where your goal is to create a horizontal or vertical line of your trees across the board before your opponent, best 2 of 3 rounds. But beware of the magic die, and exploding trees...\n")
time.sleep(1)
print("Round 1: Begin!\n")

do_break = False
mylist = []
one_turn = True
pine_score = 0
palm_score = 0
pine = ""
palm = ""
round = 1

for i in range(0,6):
        for j in range(0,7):
            mylist.append("⚪")
x = 0
for j in range(0,6):
    print(mylist[0+(7*x):7+(7*x)])
    x += 1
while True:
    while True:
        for i in range(0,6):
            for j in range(0,7):
                mylist.append("⚪")
        
        print()
        
        if one_turn == True:
            one_turn = False
            print("🌴's turn")
        elif one_turn == False:
            one_turn = True
            print("🌲's turn")
        usera = input("Which column to enter your tree? Choose 1-7: ")

        if usera != "1" and usera != "2" and usera != "3" and usera != "4" and usera != "5" and usera != "6" and usera != "7": # wrong number
            print("\nInvalid move, your turn has been skipped. git gud.")
            continue

        do_a_continue = False
        for bb in range(1,8):  # not an int
            if bb == int(usera) and (mylist[int(usera)-1] == "🌲" or mylist[int(usera)-1] == "🌴"):
                print("\nInvalid move, your turn has been skipped. git gud.")
                do_a_continue = True
                break
        if do_a_continue == True:
            continue

        if mylist[int(usera)-1] != "⚪": # trying to put on an already full column
            print("\nInvalid move, your turn has been skipped. git gud.")
            continue



        if one_turn == True:
            if usera == "1":
                for i in range(42,0,-1):
                    if i == 1 or i == 8 or i == 15 or i == 22 or i == 29 or i == 36:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌲"
                            break
            if usera == "2":
                for i in range(42,0,-1):
                    if i == 2 or i == 9 or i == 16 or i == 23 or i == 30 or i == 37:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌲"
                            break
            if usera == "3":
                for i in range(42,0,-1):
                    if i == 3 or i == 10 or i == 17 or i == 24 or i == 31 or i == 38:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌲"
                            break
            if usera == "4":
                for i in range(42,0,-1):
                    if i == 4 or i == 11 or i == 18 or i == 25 or i == 32 or i == 39:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌲"
                            break
            if usera == "5":
                for i in range(42,0,-1):
                    if i == 5 or i == 12 or i == 19 or i == 26 or i == 33 or i == 40:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌲"
                            break
            if usera == "6":
                for i in range(42,0,-1):
                    if i == 6 or i == 13 or i == 20 or i == 27 or i == 34 or i == 41:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌲"
                            break
            if usera == "7":
                for i in range(42,0,-1):
                    if i == 7 or i == 14 or i == 21 or i == 28 or i == 35 or i == 42:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌲"
                            break
        if one_turn == False:
            if usera == "1":
                for i in range(42,0,-1):
                    if i == 1 or i == 8 or i == 15 or i == 22 or i == 29 or i == 36:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌴"
                            break
            if usera == "2":
                for i in range(42,0,-1):
                    if i == 2 or i == 9 or i == 16 or i == 23 or i == 30 or i == 37:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌴"
                            break
            if usera == "3":
                for i in range(42,0,-1):
                    if i == 3 or i == 10 or i == 17 or i == 24 or i == 31 or i == 38:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌴"
                            break
            if usera == "4":
                for i in range(42,0,-1):
                    if i == 4 or i == 11 or i == 18 or i == 25 or i == 32 or i == 39:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌴"
                            break
            if usera == "5":
                for i in range(42,0,-1):
                    if i == 5 or i == 12 or i == 19 or i == 26 or i == 33 or i == 40:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌴"
                            break
            if usera == "6":
                for i in range(42,0,-1):
                    if i == 6 or i == 13 or i == 20 or i == 27 or i == 34 or i == 41:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌴"
                            break
            if usera == "7":
                for i in range(42,0,-1):
                    if i == 7 or i == 14 or i == 21 or i == 28 or i == 35 or i == 42:
                        if mylist[i-1] == "⚪":
                            mylist[i-1] = "🌴"
                            break


        x = 0
        for j in range(0,6):
            print(mylist[0+(7*x):7+(7*x)])
            x += 1


        # horizontal win
        listnumber = 0
        for q in range(1,7):
            if (mylist[listnumber] == "🌲") and (mylist[listnumber + 1] == "🌲") and (mylist[listnumber + 2] == "🌲") and (mylist[listnumber + 3] == "🌲") and (mylist[listnumber + 4] == "🌲") and (mylist[listnumber + 5] == "🌲") and (mylist[listnumber + 6] == "🌲"):
                print("\n🌲 Wins!")
                do_break = True
                break
            if (mylist[listnumber] == "🌴") and (mylist[listnumber + 1] == "🌴") and (mylist[listnumber + 2] == "🌴") and (mylist[listnumber + 3] == "🌴") and (mylist[listnumber + 4] == "🌴") and (mylist[listnumber + 5] == "🌴") and (mylist[listnumber + 6] == "🌴"):
                print("\n🌴 Wins!")
                do_break = True
                break
            listnumber += 7
        
        if do_break == True:
            break

        # vertical win
        listnumber = 0
        for q in range(1,7):
            if (mylist[listnumber] == "🌲") and (mylist[listnumber + 7] == "🌲") and (mylist[listnumber + 14] == "🌲") and (mylist[listnumber + 21] == "🌲") and (mylist[listnumber + 28] == "🌲") and (mylist[listnumber + 35] == "🌲"):
                print("\n🌲 Wins!")
                pine = "win"
                do_break = True
                break
            if (mylist[listnumber] == "🌴") and (mylist[listnumber + 7] == "🌴") and (mylist[listnumber + 14] == "🌴") and (mylist[listnumber + 21] == "🌴") and (mylist[listnumber + 28] == "🌴") and (mylist[listnumber + 35] == "🌴"):
                print("\n🌴 Wins!")
                palm = "win"
                do_break = True
                break
            listnumber += 1
        
        # magic die
        roll_die = random.randint(1,10)
        if roll_die == 1:
            print()
            for p in range(1,16): # 1.5 seconds
                i = random.randint(1,7)
                sys.stdout.write("\rThe magic die is rolling! %i" % i)
                time.sleep(0.1)
            print()
            for p in range(1,16): # 1.5 seconds
                k = random.randint(1,6)
                sys.stdout.write("\rThe magic die is rolling! %i" % k)
                time.sleep(0.1)


            the_kill = (i + (k*7-7))-1
            if mylist[the_kill] == "⚪":
                tree_picker = random.randint(1,2)
                print(f"\nThe magic die has planted a tree {i} to the left and {k} down.")

                if tree_picker == 1:
                    mylist[the_kill] = "🌴"
                if tree_picker == 2:
                    mylist[the_kill] = "🌲"
                time.sleep(1)

                g = 0
                while True:
                    g += 7
                    if (the_kill + g) < 42:
                        if mylist[the_kill+g] == "⚪":
                            print("Gravity:")
                            while True:
                                if mylist[the_kill+g] == "⚪" and (the_kill+g) < 42 :
                                    if tree_picker == 1:
                                        mylist[the_kill+g] = "🌴"
                                        mylist[the_kill+g-7] = "⚪"
                                    if tree_picker == 2:
                                        mylist[the_kill+g] = "🌲"
                                        mylist[the_kill+g-7] = "⚪"
                                    x = 0
                                    for j in range(0,6):
                                        print(mylist[0+(7*x):7+(7*x)])
                                        x += 1
                                    time.sleep(1)
                                else:
                                    break
                        else:
                            break
                    else:
                        break

            
            elif mylist[the_kill] == "🌴" or mylist[the_kill] == "🌲":
                print(f"\nOh no, the tree {i} to the left and {k} down is exploding!")
                pygame.mixer.Channel(0).play(pygame.mixer.Sound('explosion.mp3'))
                mylist[the_kill] = "💥"
                x = 0
                for j in range(0,6):
                    print(mylist[0+(7*x):7+(7*x)])
                    x += 1
                g = 0
                while True:
                    if g < 37:
                        mylist[the_kill-g] = mylist[the_kill-g-7]

                    else:
                        mylist[the_kill-g-7] = "⚪"
                        x = 0
                        print("Gravity:")
                        for j in range(0,6):
                            print(mylist[0+(7*x):7+(7*x)])
                            x += 1
                        time.sleep(1)
                        break
                    g += 7

            
        
        if do_break == True:
            break

        

        # explosion
        there_was_an_explosion = False
        if (mylist[35] == "🌲" or mylist[35] == "🌴") and (mylist[36] == "🌲" or mylist[36] == "🌴") and (mylist[37] == "🌲" or mylist[37] == "🌴") and (mylist[38] == "🌲" or mylist[38] == "🌴") and (mylist[39] == "🌲" or mylist[39] == "🌴") and (mylist[40] == "🌲" or mylist[40] == "🌴") and (mylist[41] == "🌲" or mylist[41] == "🌴"):
            explosion = random.randint(35,41)
            mylist[explosion] = "💥"
            there_was_an_explosion = True

            x = 0
            time.sleep(1)
            print("EXPLOSION, TAKE COVER:")
            pygame.mixer.Channel(0).play(pygame.mixer.Sound('explosion.mp3'))
            for j in range(0,6):
                print(mylist[0+(7*x):7+(7*x)])
                x += 1

            # gravity moves everything down
            if there_was_an_explosion == True:
                mylist[explosion] = mylist[explosion-7]
                mylist[explosion-7] = mylist[explosion-14]
                mylist[explosion-14] = mylist[explosion-21]
                mylist[explosion-21] = mylist[explosion-28]
                mylist[explosion-28] = mylist[explosion-35]
                mylist[explosion-35] = "⚪"
            time.sleep(1) 
            print("Gravity:")

            x = 0
            for j in range(0,6):
                print(mylist[0+(7*x):7+(7*x)])
                x += 1
            time.sleep(1)


            # horizontal win
            listnumber = 0
            for q in range(1,7):
                if (mylist[listnumber] == "🌲") and (mylist[listnumber + 1] == "🌲") and (mylist[listnumber + 2] == "🌲") and (mylist[listnumber + 3] == "🌲") and (mylist[listnumber + 4] == "🌲") and (mylist[listnumber + 5] == "🌲") and (mylist[listnumber + 6] == "🌲"):
                    print("\n🌲 Wins!")
                    pine = "win"
                    do_break = True
                    break
                if (mylist[listnumber] == "🌴") and (mylist[listnumber + 1] == "🌴") and (mylist[listnumber + 2] == "🌴") and (mylist[listnumber + 3] == "🌴") and (mylist[listnumber + 4] == "🌴") and (mylist[listnumber + 5] == "🌴") and (mylist[listnumber + 6] == "🌴"):
                    print("\n🌴 Wins!")
                    palm = "win"
                    do_break = True
                    break
                listnumber += 7
            
            if do_break == True:
                break
            
                # vertical win
            listnumber = 0
            for q in range(1,8):
                if (mylist[listnumber] == "🌲") and (mylist[listnumber + 7] == "🌲") and (mylist[listnumber + 14] == "🌲") and (mylist[listnumber + 21] == "🌲") and (mylist[listnumber + 28] == "🌲") and (mylist[listnumber + 35] == "🌲"):
                    print("\n🌲 Wins!")
                    pine = "win"
                    do_break = True
                    break
                if (mylist[listnumber] == "🌴") and (mylist[listnumber + 7] == "🌴") and (mylist[listnumber + 14] == "🌴") and (mylist[listnumber + 21] == "🌴") and (mylist[listnumber + 28] == "🌴") and (mylist[listnumber + 35] == "🌴"):
                    print("\n🌴 Wins!")
                    palm = "win"
                    do_break = True
                    break
                listnumber += 1
            
            if do_break == True:
                break

        time.sleep(.1)

    do_break = False
    mixer.music.stop()
    mixer.music.load('you win.mp3')

    #Play the music
    time.sleep(1)
    mixer.music.play()
    time.sleep(3)

    #Load audio file
    mixer.music.load('intro.mp3')

    #Set preferred volume
    mixer.music.set_volume(0.2)

    #Play the music
    mixer.music.play(loops = -1)

    if pine == "win":
        pine_score += 1
        pine = ""
    if palm == "win":
        palm_score += 1
        palm = ""
    round += 1
    print(f"\n🌴 wins: {palm_score}")
    print(f"🌲 wins: {pine_score}\n")

    if palm_score > 1:
        print(f"\n===============================================\n🌴 has won 2 rounds, they are the champion of Deforestation!\n===============================================")
        break
    if pine_score > 1:
        print(f"\n===============================================\n🌲 has won 2 rounds, they are the champion of Deforestation!\n===============================================")
        break

    print(f"\nRound {round}: Begin!")
    mylist = []


mixer.music.load('you win.mp3')
#Play the music
time.sleep(1)
mixer.music.play()
time.sleep(3)
mixer.music.play()
time.sleep(3)
mixer.music.play()
time.sleep(3)