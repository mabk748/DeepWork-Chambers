# Introduction:
    This project is software representation of the Eudaimonia Machine proposed in the Deep Work book by Carl Newport in the 2nd part of his book "The Rules", Rule #1 where he cites:

    *"As Dewane explained the machine to me [...]. The structure is a one-story narrow rectangle made up of five rooms, placed in a line, one after another. There’s no shared hallway: you have to pass through one room to get to the next. [...]
    The  first  room  you  enter  when  coming  off  the  street  is  called  the  gallery.  In Dewane’s  plan,  this  room  would  contain  examples  of  deep  work  produced  in  the building.  It’s  meant  to  inspire  users  of  the  machine,  creating  a  “culture  of  healthy stress and peer pressure.” 
    As you leave the gallery, you next enter the salon. In here, Dewane imagines access to high-quality coffee and perhaps even a full bar. There are also couches and Wi-Fi. The salon is designed to create a mood that “hovers between intense curiosity and argumentation.” This is a place to debate, “brood,” and in general work through the ideas that you’ll develop deeper in the machine. 
    Beyond the salon you enter the library. This room stores a permanent record of all work produced in the machine, as well as the books and other resources used in this previous work.[...] Dewane  describes  the  library  as  “the  hard drive of the machine.” 
    The next room is the office space. It contains a standard conference room with a whiteboard  and  some  cubicles  with  desks.  “The  office,”  Dewane  explains,  “is  for low-intensity  activity.”  [...] This  is  the  space  to  complete  the shallow efforts required by your project. [...] 
    This brings us to the final room of the machine, [...] “deep  work  chambers”  (he adopted the term “deep work” from my articles on the topic).[...] “The purpose of the deep work chamber is to allow for total focus and uninterrupted work flow,” Dewane explains. He imagines a process in which you spend ninety minutes inside, take a ninety-minute break, and repeat two or three times—at which point your brain will have achieved its limit of concentration for the day." Deep Work , Carl Newport p.*

# System Architecture:
    This program will follow the five rooms concept.
    This version of the project will be a CLI where the user will use navigate between the rooms in order, each room will have the functionalities as described in the book:
    - Galery:
        It is a page where the user will have a display of the projects that have been worked on with a little summary, It will be the main page with an overwiew of the last session's work and where the user have left of as saved. A calendar with the day's work as blocks.
    - Salon:
        It's a page where there will be access to a kanban interface with the possiblity to have discussions with team members either having the same software or connecting via other chat apps and the possibility to interract with an LLM, and the possibility to update the calendar and to-do list.
    - Library:
        It's a page that displays the projects with all their details (documents used in the research phase, history of savings, notes...), The user can browse them and create a branch of the project from a saved point, The user can import and export projects.
    - Office:
        It's a page that gives the user the ability to work on simple tasks, the notifications from other softwares will still be activated. The user can browse the internet, read documents, take notes, browse and modify projects..., the user waill have access to an LLM that will be capable of answering questions via a chat box.
    - Deep Work chambers:
        It's a page where the user will be focused on one or multiple tasks without disturbance, he will have either one or multiple apps open which will be chosen in the office page. No notification can pass throught they will be stored and displayed once the user is out of the chambers, there will be a timer set out from the entry to this page and the ability to have an internal notifier for important reminders. There will be a chat box where the user will have access to the same LLM to help with the work.
    