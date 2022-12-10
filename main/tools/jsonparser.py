import json
from collections import OrderedDict

with open('/home/ethan/swapphabet/data/pokedex.json') as pokedex:
    poke_dict = json.load(pokedex)
    for poke in poke_dict :
        name = poke["name"]
        if poke["id"] < 152 : 
            #print(name["french"])
            pokename = name["french"]
            with open('/home/ethan/swapphabet/data/dataset.json', "a") as dataset:
                print(pokename)
                dataset.write(f"\n  \"{pokename}\", ")
