package Gussing_Game;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class GuessWord extends Game{
    static Scanner in = new Scanner(System.in);
    public String inputString(String message){
        System.out.print(message);
        return in.next();
    }

    public void start(){
        System.out.println("Guess the word game started");
    }

    public void guess(){
        System.out.println("Guess the word");
        Map<String, String> wordMap = new HashMap<>() {{
            // Words starting with A
            put("Apple", "A fruit that is typically red or green");
            put("Ant", "A small insect that lives in colonies");
            put("Airplane", "A powered flying vehicle with wings");
            put("Apron", "A protective garment worn over the front of one's clothes");
            put("Anchor", "A device used to secure a vessel to the sea bottom");
            put("Angel", "A spiritual being often depicted as a messenger of God");
            put("Acorn", "The nut of an oak tree");
            put("Alligator", "A large reptile similar to a crocodile");
            put("Artist", "A person who creates art");
            put("Axe", "A tool with a heavy bladed head used for chopping wood");
            put("Arrow", "A pointed weapon shot from a bow");
        
            // Words starting with B
            put("Ball", "A round object used in games and sports");
            put("Banana", "A long curved fruit with a yellow skin");
            put("Butterfly", "An insect with large, often colorful wings");
            put("Book", "A set of written or printed pages bound together");
            put("Boat", "A small vessel for traveling on water");
            put("Box", "A container with a flat base and sides");
            put("Bear", "A large heavy mammal with thick fur and a short tail");
            put("Bee", "A flying insect that collects nectar and pollen");
            put("Bed", "A piece of furniture for sleeping on");
            put("Bicycle", "A vehicle composed of two wheels held in a frame");
        
            // Words starting with C
            put("Cat", "A small domesticated carnivorous mammal");
            put("Car", "A road vehicle with an engine, four wheels, and seats for a small number of people");
            put("Cake", "A sweet baked dessert usually made from flour, sugar, and eggs");
            put("Clock", "A device used for measuring and indicating time");
            put("Cow", "A large domesticated bovine animal kept for milk");
            put("Chair", "A piece of furniture for one person to sit on");
            put("Camera", "A device for taking photographs or making films");
            put("Crab", "A crustacean with a broad carapace and pincers");
            put("Cloud", "A visible mass of condensed water vapor floating in the sky");
            put("Cup", "A small open container used for drinking");
        
            // Words starting with D
            put("Dog", "A domesticated carnivorous mammal that typically has a long snout");
            put("Duck", "A waterbird with a broad blunt bill and webbed feet");
            put("Door", "A hinged, sliding, or revolving barrier at the entrance to a building, room, or vehicle");
            put("Desk", "A piece of furniture with a flat or sloped surface for writing and reading");
            put("Drum", "A percussion instrument sounded by being struck with sticks or hands");
            put("Doll", "A small model of a human figure used as a child's toy");
            put("Dolphin", "A small toothed whale with a beaklike snout");
            put("Dress", "A one-piece garment for a woman or girl that covers the body and extends down over the legs");
            put("Dish", "A shallow, typically flat-bottomed container for cooking or serving food");
            put("Diamond", "A precious stone consisting of a clear and typically colorless crystalline form of pure carbon");
        
            // Words starting with E
            put("Elephant", "A large mammal with a trunk");
            put("Egg", "An oval or round object laid by a female bird, reptile, fish, or invertebrate");
            put("Ear", "The organ of hearing and balance in humans and other vertebrates");
            put("Eagle", "A large bird of prey with a massive hooked bill and long broad wings");
            put("Engine", "A machine with moving parts that converts power into motion");
            put("Envelope", "A flat paper container with a sealable flap, used to enclose a letter or document");
            put("Eye", "The organ of sight in humans and animals");
            put("Earth", "The planet on which we live; the world");
            put("Eraser", "A piece of soft rubber used to rub out something written");
            put("Elbow", "The joint between the forearm and the upper arm");
        
            // Words starting with F
            put("Fish", "An aquatic animal with gills and fins");
            put("Frog", "A tailless amphibian with a short squat body, moist smooth skin, and very long hind legs");
            put("Fan", "A device for creating a current of air by the movement of a surface or surfaces");
            put("Fire", "Combustion or burning, in which substances combine chemically with oxygen from the air and typically give out bright light, heat, and smoke");
            put("Flower", "The seed-bearing part of a plant, consisting of reproductive organs that are typically surrounded by a brightly colored corolla and a green calyx");
            put("Fork", "A tool or implement with two or more prongs used for lifting food to the mouth or holding it when cutting");
            put("Fox", "A carnivorous mammal of the dog family with a pointed muzzle and bushy tail");
            put("Feather", "Any of the flat appendages growing from a bird's skin and forming its plumage");
            put("Forest", "A large area covered chiefly with trees and undergrowth");
            put("Fence", "A barrier, railing, or other upright structure enclosing an area");
        
            // Words starting with G
            put("Giraffe", "A tall mammal with a long neck and legs");
            put("Goat", "A hardy domesticated ruminant animal that has backward curving horns and a beard");
            put("Grapes", "A fruit, typically green (classified as white), red, or black, growing in clusters on a grapevine, eaten as fruit, and used in making wine");
            put("Gloves", "Coverings for the hands, typically with separate parts for each finger and the thumb");
            put("Guitar", "A stringed musical instrument, typically with six strings, played by plucking or strumming with the fingers or a plectrum");
            put("Gate", "A hinged barrier used to close an opening in a wall, fence, or hedge");
            put("Ghost", "The soul or spirit of a dead person or animal that can appear to the living");
            put("Grass", "Vegetation consisting of typically short plants with long, narrow leaves, growing wild or cultivated on lawns and pasture, and as a fodder crop");
            put("Glasses", "A pair of lenses set in a frame resting on the nose and ears, used to correct or assist defective eyesight or protect the eyes");
            put("Garden", "A piece of ground, often near a house, used for growing flowers, fruit, or vegetables");
        
            // Words starting with H
            put("House", "A building for human habitation");
            put("Hat", "A shaped covering for the head worn for warmth, as a fashion item, or as part of a uniform");
            put("Horse", "A large plant-eating domesticated mammal with solid hoofs and a flowing mane and tail, used for riding, racing, and to carry and pull loads");
            put("Hand", "The end part of a person's arm beyond the wrist, including the palm, fingers, and thumb");
            put("Helicopter", "A type of aircraft which derives both lift and propulsion from one or more sets of horizontally revolving overhead rotors");
            put("Hammer", "A tool with a heavy metal head mounted at right angles at the end of a handle, used for jobs such as breaking things and driving in nails");
            put("Heart", "A hollow muscular organ that pumps the blood through the circulatory system by rhythmic contraction and dilation");
            put("Helium", "The chemical element of atomic number 2, an inert gas which is the lightest member of the noble gas series");
            put("Helmet", "A hard or padded protective hat, various types of which are worn by soldiers, police officers, motorcyclists, athletes, and others");
            put("Hill", "A naturally raised area of land, not as high or craggy as a mountain");
        
            // Words starting with I
            put("Igloo", "A dome-shaped Eskimo house, typically built from blocks of solid snow");
            put("Ice", "Frozen water, a brittle transparent crystalline solid");
            put("Island", "A piece of land surrounded by water");
            put("Insect", "A small arthropod animal that has six legs and generally one or two pairs of wings");
            put("Iron", "A strong, hard magnetic silvery-gray metal, often used to make tools and machines");
            put("Ink", "A colored fluid used for writing, drawing, printing, or duplicating");
            put("Iceberg", "A large floating mass of ice detached from a glacier or ice sheet and carried out to sea");
            put("Ivory", "A hard, white material from the tusks (traditionally elephants) and teeth of animals, used especially in art and manufacturing");
            put("Instrument", "A tool or implement, especially one for delicate or scientific work");
            put("Internet", "A global computer network providing a variety of information and communication facilities, consisting of interconnected networks using standardized communication protocols");
        
            // Words starting with J
            put("Jaguar", "A large wild cat found in the Americas");
            put("Jacket", "An outer garment extending either to the waist or the hips, typically having sleeves and a fastening down the front");
            put("Juice", "The liquid obtained from or present in fruit or vegetables");
            put("Jam", "A sweet spread or preserve made from fruit and sugar");
            put("Jar", "A wide-mouthed, cylindrical container made of glass or pottery, especially one used for storing food");
            put("Jet", "A rapid stream of liquid or gas forced out of a small opening");
            put("Jewel", "A precious stone or a piece of jewelry");
            put("Jungle", "An area of land overgrown with dense forest and tangled vegetation, typically in the tropics");
            put("Jeans", "Hard-wearing trousers made of denim or other cotton fabric");
            put("Jelly", "A sweet, clear, semisolid spread or preserve made from fruit juice and sugar boiled to a thick consistency");
        
            // Words starting with K
            put("Kite", "A lightweight frame covered with paper or cloth, flown in the wind at the end of a string");
            put("Kangaroo", "A large plant-eating Australian marsupial with a long powerful tail and strongly developed hindlimbs enabling it to travel by leaping");
            put("King", "The male ruler of an independent state, especially one who inherits the position by right of birth");
            put("Key", "A small piece of shaped metal with incisions cut to fit the wards of a particular lock");
            put("Kitchen", "A room or area where food is prepared and cooked");
            put("Kettle", "A container or device in which water is boiled, having a lid, spout, and handle");
            put("Knife", "An instrument composed of a blade fixed into a handle, used for cutting or as a weapon");
            put("Knee", "The joint between the thigh and the lower leg in humans");
            put("Knot", "A fastening made by tying a piece of string, rope, or something similar");
            put("Kettle", "A container or device in which water is boiled, having a lid, spout, and handle");
        
            // Words starting with L
            put("Lion", "A large wild cat with a mane");
            put("Lemon", "A yellow, oval citrus fruit with thick skin and fragrant, acidic juice");
            put("Leaf", "A flattened structure of a higher plant, typically green and blade-like, that is attached to a stem directly or via a stalk");
            put("Lamp", "A device for giving light, especially one that has a covering or is contained within something");
            put("Ladder", "A structure consisting of a series of bars or steps between two upright lengths of wood, metal, or rope, used for climbing up or down something");
            put("Lake", "A large body of water surrounded by land");
            put("Lamb", "A young sheep");
            put("Lock", "A mechanism for keeping a door, lid, etc., fastened, typically operated only by a key of a particular form");
            put("Leg", "Each of the limbs on which a person or animal walks and stands");
            put("Light", "The natural agent that stimulates sight and makes things visible");
        
            // Words starting with M
            put("Monkey", "A primate that typically has a long tail");
            put("Mouse", "A small rodent that typically has a pointed snout, relatively large ears and eyes, and a long tail");
            put("Milk", "A whitish fluid containing proteins, fats, lactose, and various vitamins and minerals, produced by the mammary glands of all mature female mammals");
            put("Moon", "The natural satellite of the earth, visible (chiefly at night) by reflected light from the sun");
            put("Mountain", "A large natural elevation of the earth's surface rising abruptly from the surrounding level; a large steep hill");
            put("Mirror", "A reflective surface, now typically of glass coated with a metal amalgam, that reflects a clear image");
            put("Mango", "A fleshy stone fruit belonging to the genus Mangifera, consisting of numerous tropical fruiting trees");
            put("Mat", "A piece of coarse material placed on a floor for people to wipe their feet on");
            put("Mail", "Letters and parcels sent by post");
            put("Microscope", "An optical instrument used for viewing very small objects, such as mineral samples or animal or plant cells");
        
            // Words starting with N
            put("Nest", "A structure built by birds for laying eggs and raising young");
            put("Nut", "A fruit consisting of a hard or tough shell around an edible kernel");
            put("Nail", "A small metal spike with a broadened flat head, driven into wood to join things together or to serve as a hook");
            put("Necklace", "An ornamental chain or string of beads, jewels, or links worn around the neck");
            put("Nose", "The part of the face or head through which a person or animal breathes and smells");
            put("Notebook", "A small book with blank or ruled pages for writing notes in");
            put("Napkin", "A square piece of cloth or paper used at a meal to wipe the fingers or lips and to protect garments");
            put("Needle", "A small, thin implement, usually made of polished steel, with a point at one end and an eye to receive thread at the other, used in sewing");
            put("Nest", "A structure built by birds or other animals for laying eggs and sheltering offspring");
            put("Night", "The period from sunset to sunrise in each twenty-four hours");
        
            // Words starting with O
            put("Orange", "A citrus fruit that is round and typically orange");
            put("Owl", "A nocturnal bird of prey with large forward-facing eyes surrounded by facial disks, a hooked beak, and typically a loud call");
            put("Ocean", "A very large expanse of sea, in particular, each of the main areas into which the sea is divided geographically");
            put("Ostrich", "A flightless swift-running African bird with a long neck, long legs, and two toes on each foot");
            put("Oven", "An enclosed compartment, usually part of a cooker, for cooking and heating food");
            put("Oil", "A viscous liquid derived from petroleum, especially for use as a fuel or lubricant");
            put("Onion", "An edible bulb with a pungent taste and smell, composed of several concentric layers, used in cooking");
            put("Octopus", "A cephalopod mollusk with eight sucker-bearing arms, a soft saclike body, strong beaklike jaws, and no internal shell");
            put("Orchestra", "A group of instrumentalists, especially one combining string, woodwind, brass, and percussion sections and playing classical music");
            put("Oxygen", "A colorless, odorless reactive gas, the chemical element of atomic number 8 and the life-supporting component of the air");
        
            // Words starting with P
            put("Penguin", "A flightless seabird with black and white plumage");
            put("Pencil", "An instrument for writing or drawing, typically consisting of a thin stick of graphite or a similar substance enclosed in a long thin piece of wood or covered plastic");
            put("Pizza", "A dish of Italian origin consisting of a flat, round base of dough baked with a topping of tomatoes and cheese, typically with added meat or vegetables");
            put("Potato", "A starchy plant tuber which is one of the most important food crops, cooked and eaten as a vegetable");
            put("Parrot", "A bird, often vividly colored, with a short downcurved hooked bill, an upright stance, and a strong, agile tongue");
            put("Pineapple", "A large juicy tropical fruit consisting of aromatic edible yellow flesh surrounded by a tough segmented skin and topped with a tuft of stiff leaves");
            put("Pillow", "A rectangular cloth bag stuffed with feathers, foam rubber, or other soft materials, used to support the head when lying down");
            put("Plane", "A powered flying vehicle with fixed wings and a weight greater than that of the air it displaces; an aeroplane");
            put("Peach", "A round stone fruit with juicy yellow flesh and downy pinkish-yellow skin");
            put("Panda", "A large bearlike mammal with characteristic black-and-white markings, native to certain mountain forests in China");
        
            // Words starting with Q
            put("Queen", "A female ruler of a country");
            put("Quilt", "A warm bed covering made of padding enclosed between layers of fabric and kept in place by lines of stitching, typically applied in a decorative design");
            put("Quail", "A small, short-tailed Old World game bird resembling a tiny partridge, typically having brown camouflaged plumage");
            put("Quartz", "A hard white or colorless mineral consisting of silicon dioxide, found widely in igneous, metamorphic, and sedimentary rocks");
            put("Quicksand", "Loose wet sand that yields easily to pressure and sucks in anything resting on or falling into it");
            put("Queue", "A line or sequence of people or vehicles awaiting their turn to be attended to or to proceed");
            put("Quiver", "A slight trembling movement or sound, especially one caused by a sudden strong emotion");
            put("Quiz", "A test of knowledge, especially a brief, informal test given to students");
            put("Quote", "Repeat or copy out a group of words from a text or speech, typically with an indication that one is not the original author or speaker");
            put("Quagmire", "A soft boggy area of land that gives way underfoot");

            // Words starting with R
            put("Rabbit", "A small mammal with long ears");
            put("Rainbow", "An arc of colors visible in the sky caused by refraction and dispersion of the sun's light by rain or other water droplets");
            put("Robot", "A machine capable of carrying out a complex series of actions automatically, especially one programmable by a computer");
            put("Rose", "A prickly bush or shrub that typically bears red, pink, yellow, or white fragrant flowers");
            put("River", "A large natural stream of water flowing in a channel to the sea, a lake, or another such stream");
            put("Rock", "A solid mineral material forming part of the surface of the earth and other similar planets, exposed on the surface or underlying the soil");
            put("Ring", "A small circular band, typically of precious metal, worn on a finger as an ornament or a token of marriage, engagement, or authority");
            put("Rocket", "A cylindrical projectile that can be propelled to a great height or distance by the combustion of its contents, used typically as a firework or signal");
            put("Rope", "A length of strong cord made by twisting together strands of natural fibers such as hemp or artificial fibers such as polypropylene");
            put("Ruler", "A person exercising government or dominion");

            // Words starting with S
            put("Snake", "A long limbless reptile");
            put("Sun", "The star around which the earth orbits");
            put("Star", "A fixed luminous point in the night sky that is a large, remote incandescent body like the sun");
            put("Sheep", "A domesticated ruminant animal with a thick woolly coat and (typically only in the male) curving horns");
            put("Sand", "A loose granular substance, typically pale yellowish brown, resulting from the erosion of siliceous and other rocks and forming a major constituent of beaches, riverbeds, the seabed, and deserts");
            put("Shoe", "A covering for the foot, typically made of leather, having a sturdy sole and not reaching above the ankle");
            put("Ship", "A large boat for transporting people or goods by sea");
            put("Spoon", "An implement consisting of a small, shallow oval or round bowl on a long handle, used for eating, stirring, and serving food");
            put("Starfish", "A marine echinoderm with five or more radiating arms");
            put("Scissors", "An instrument used for cutting cloth, paper, and other thin material, consisting of two pivoted blades");

            // Words starting with T
            put("Tiger", "A large wild cat with a striped coat");
            put("Table", "A piece of furniture with a flat top and one or more legs, providing a level surface for eating, writing, or working at");
            put("Tree", "A perennial plant with an elongated stem, or trunk, supporting branches and leaves in most species");
            put("Turtle", "A slow-moving reptile, enclosed in a scaly or leathery domed shell");
            put("Tomato", "A glossy red, or occasionally yellow, pulpy edible fruit that is typically eaten as a vegetable or in a salad");
            put("Train", "A series of connected railroad cars pulled or pushed by one or more locomotives");
            put("Telephone", "A system for transmitting voices over a distance using wire or radio, by converting acoustic vibrations to electrical signals");
            put("Telescope", "An optical instrument designed to make distant objects appear nearer, containing an arrangement of lenses, or of curved mirrors and lenses, by which rays of light are collected and focused and the resulting image magnified");
            put("Tooth", "Each of a set of hard, bony enamel-coated structures in the jaws of most vertebrates, used for biting and chewing");
            put("Truck", "A large, heavy motor vehicle for transporting goods or troops");

            // Words starting with U
            put("Umbrella", "A device used for protection against rain or sunlight");
            put("Unicorn", "A mythical animal typically represented as a horse with a single straight horn projecting from its forehead");
            put("Uniform", "The distinctive clothing worn by members of the same organization or body or by children attending certain schools");
            put("Universe", "All existing matter and space considered as a whole; the cosmos");
            put("Urn", "A tall, rounded vase with a stem and base, especially one used for storing the ashes of a cremated person");
            put("Umpire", "An official who watches a game or match closely to enforce the rules and arbitrate on matters arising from the play");
            put("Utensil", "A tool, container, or other article, especially for household use");
            put("Upholstery", "Soft, padded textile covering that is fixed to furniture such as armchairs and sofas");
            put("Utility", "The state of being useful, profitable, or beneficial");
            put("Uranium", "The chemical element of atomic number 92, a dense gray radioactive metal used as a fuel in nuclear reactors");

            // Words starting with V
            put("Violin", "A string instrument played with a bow");
            put("Vase", "A decorative container, typically made of glass or china and used as an ornament or for displaying cut flowers");
            put("Van", "A medium to large motor vehicle, typically without side windows in the rear part, for transporting goods");
            put("Vulture", "A large bird of prey with the head and neck more or less bare of feathers, feeding chiefly on carrion");
            put("Vegetable", "A plant or part of a plant used as food, typically as an accompaniment to meat or fish");
            put("Volcano", "A mountain or hill with a crater or vent through which lava, rock fragments, hot vapor, and gas are or have been erupted from the earth's crust");
            put("Velvet", "A closely woven fabric of silk, cotton, or nylon that has a thick short pile on one side");
            put("Vine", "A climbing or trailing woody-stemmed plant of the grape family");
            put("Vacuum", "A space entirely devoid of matter");
            put("Victory", "An act of defeating an enemy or opponent in a battle, game, or other competition");

            // Words starting with W
            put("Whale", "A large marine mammal");
            put("Water", "A transparent, tasteless, odorless, and nearly colorless chemical substance, which is the main constituent of Earth's streams, lakes, and oceans, and the fluids of most living organisms");
            put("Wind", "The perceptible natural movement of the air, especially in the form of a current of air blowing from a particular direction");
            put("Wolf", "A wild carnivorous mammal of the dog family, living and hunting in packs");
            put("Window", "An opening in the wall or roof of a building or vehicle that is fitted with glass or other transparent material in a frame to admit light or air and allow people to see out");
            put("Watch", "A small timepiece worn typically on a strap on one's wrist");
            put("Wheel", "A circular object that revolves on an axle and is fixed below a vehicle or other object to enable it to move over the ground");
            put("Wagon", "A four-wheeled vehicle for transporting goods or another specified purpose");
            put("Whistle", "A small device that makes a whistling sound when blown into");
            put("Walrus", "A large gregarious marine mammal of arctic waters, related to the eared seals and having two large downward-pointing tusks");

            // Words starting with X
            put("Xylophone", "A musical instrument with wooden bars struck by mallets");
            put("X-ray", "A type of radiation that can pass through most objects, including the body. In the body, dense structures like bone show up white, while softer structures like organs and muscles show up in shades of gray and black");
            put("Xerox", "A brand name used for a photocopying process or machine");
            put("Xenon", "The chemical element of atomic number 54, a member of the noble gas series");
            put("Xylophonist", "A person who plays the xylophone");
            put("Xenophobia", "Dislike of or prejudice against people from other countries");
            put("Xenial", "Relating to hospitality or relations between host and guest");
            put("Xylem", "The vascular tissue in plants that conducts water and dissolved nutrients upward from the root and also helps to form the woody element in the stem");
            put("Xenogenesis", "The supposed generation of offspring completely and permanently different from the parent");
            put("Xerophyte", "A plant that needs very little water");

            // Words starting with Y
            put("Yak", "A long-haired domesticated bovid found in the Himalayas");
            put("Yacht", "A medium-sized sailboat equipped for cruising or racing");
            put("Yarn", "Spun thread used for knitting, weaving, or sewing");
        

            put("Yellow", "The color between green and orange in the spectrum, a primary subtractive color complementary to blue");
            put("Yawn", "Involuntarily open one's mouth wide and inhale deeply due to tiredness or boredom");
            put("Yogurt", "A semi-solid sourish food prepared from milk fermented by added bacteria");
            put("Yard", "A unit of linear measure equal to 3 feet (0.9144 meter)");
            put("Yolk", "The yellow internal part of a bird's egg, rich in protein and fat, and nourishes the developing embryo");
            put("Yawn", "A reflex act of opening one's mouth wide and inhaling deeply due to tiredness or boredom");
            put("Yield", "Produce or provide (a natural, agricultural, or industrial product)");

            // Words starting with Z
            put("Zebra", "An African wild horse with black-and-white stripes and an erect mane");
            put("Zoo", "A facility with usually indoor and outdoor settings where living, typically wild animals are kept especially for public exhibition");
            put("Zipper", "A fastening device consisting of two flexible strips of metal or plastic with interlocking projections closed or opened by pulling a slide along them");
            put("Zodiac", "A belt of the heavens within about 8° either side of the ecliptic, including all apparent positions of the sun, moon, and most familiar planets");
            put("Zero", "The figure 0; nought");
            put("Zucchini", "A variety of summer squash typically dark green in color");
            put("Zigzag", "A line or course having abrupt alternate right and left turns");
            put("Zephyr", "A soft gentle breeze");
            put("Zest", "Great enthusiasm and energy");
            put("Zone", "An area or stretch of land having a particular characteristic, purpose, or use, or subject to particular restrictions");
        }};
        String word = (String)wordMap.keySet().toArray()[(int)(Math.random() * wordMap.size())];    
        String guess = " ";
        
        System.out.println("Guess the first letter first (Input upper case letter)");
        while (guess.charAt(0) != word.charAt(0)){
            guess = inputString("Enter your guess(0 to exit): ");
            if (guess.charAt(0) == '0'){
                System.out.println(word.charAt(0) + " was the character :<");
                break;
            }
            if (guess.charAt(0) == word.charAt(0)){
                System.out.println("Hurray!! You finally found the character");
                break;
            }
            else if (word.charAt(0) - 1 == guess.charAt(0)){
                System.out.println("Close to the character but behind");
            }
            else if (word.charAt(0) + 1 == guess.charAt(0)){
                System.out.println("Close to the character but ahead");
            }
            else{
                System.out.println("Character is eternal far");
            }
        }


        System.out.println("Hint: " + wordMap.get(word) + ", first letter should be capitalized");   
        while (!guess.equals(word)){
            guess = inputString("Enter your guess(0 to exit): ");
            if (guess.equals("0")){
                System.out.println(word + " was the word :<");
                break;
            }
            if (guess.equals(word)){
                System.out.println("Hurray!! You finally found the word");
                break;
            }
            else{
                System.out.println("Try again");
            }
        }
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        GuessWord guessWord = new GuessWord();
        guessWord.start();
    }
}
