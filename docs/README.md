# Documentation

CLI runs the program:
java TopSecret [args]

CLI must have the functionality to:
- get input from CLI (to go into program controller)
- send output (print) to CLI

Program controller links the CLI input to file handler, then sends stuff to print back to the CLI as readable output (incorporate the business logic for the arguments)

File handler will ONLY read the specified (get logic from program controller) file(s) and send output back to program controller:
- if there's no args, it will send back a list of files in the dir (data/)
- if args, the program controller will specify which file to get data for 