package menudrivengroup5;
import java.util.*;
public class MenuDrivenApp {
   // Cute Pastel Colors
   public static final String RESET = "\033[0m";
   public static final String PINK = "\033[95m";
   public static final String CYAN = "\033[96m";
   public static final String YELLOW = "\033[93m";
   public static final String GREEN = "\033[92m";
   public static final String PURPLE = "\033[35m";
   public static final String WHITE = "\033[97m";
   public static final String BLUE = "\033[94m";
   public static final String BG_PINK = "\033[105m";
   public static final String BG_WHITE = "\033[47m";
   public static final String BG_CYAN = "\033[106m";
   public static final String BG_RED = "\033[41m";
   public static final String BOLD = "\033[1m";
  
   static Scanner sc = new Scanner(System.in);
   static int option;
   static double num1, num2, radius, Cm, result, result2;
   static boolean exit = false;
   
   public static void main(String[] args) throws InterruptedException {
       loading();
       Clearscreen();
       StartScreen();
       while (!exit) {
           try {
               option = sc.nextInt();
               if (option > 3 || option < 0) {
                   Clearscreen();
                   CuteError();
               }
           } catch (InputMismatchException e) {
               sc.nextLine();
           }
       }
   }
   
   public static void StartScreen() throws InterruptedException {
       System.out.println("\n\n\n");
       System.out.println(PINK +"\t\t\t\t\t╔═════════════════════════════════════════════════════╗");
       System.out.println(PINK + "\t\t\t\t\t║                                                          ║");
       System.out.println(PINK + "\t\t\t\t\t║          ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡          ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║            ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡            ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║              ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡              ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡                ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                  ♡_♡_♡_♡_♡_♡_♡_♡_♡                  ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                                                          ║");
       System.out.println(CYAN + "\t\t\t\t\t║                        ∧＿∧                             ║" + RESET);
       System.out.println(CYAN + "\t\t\t\t\t║                      (｡･ω･｡)ﾉ                         ║" + RESET);
       System.out.println(CYAN + "\t\t\t\t\t║                      /    づ♡                           ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                                                          ║");
       System.out.println(YELLOW + BOLD + "\t\t\t\t\t║              ✿ KAWAII MENU SYSTEM ✿                     ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                                                          ║");
       System.out.println(WHITE + BOLD +"\t\t\t\t\t║                  [1] 📋 Menu                            ║");
       System.out.println(WHITE + BOLD +"\t\t\t\t\t║                  [2] 💖 About Us                        ║");
       System.out.println(WHITE + BOLD +"\t\t\t\t\t║                  [3] 👋 Exit                            ║");
       System.out.println(PINK + "\t\t\t\t\t║                                                          ║");
       System.out.println(PINK + "\t\t\t\t\t║                  ♡_♡_♡_♡_♡_♡_♡_♡_♡                  ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡                ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║            ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡            ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║          ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡          ║" + RESET);
       System.out.println("\t\t\t\t\t║                                                          ║");
       System.out.println(PINK +"\t\t\t\t\t╚═════════════════════════════════════════════════════╝");
       System.out.print("\n" + PINK + BOLD + "\t\t\t\t\t\tChoose your option: " + RESET);
       
       try {
           option = (int) getUserInput1();
           switch (option) {
               case 1:
                   Start();
                   break;
               case 2:
                   Aboutus();
                   break;
               case 3:
                   Exit();
                   break;
               default:
                   Clearscreen();
                   CuteError();
                   break;
           }
       } catch (InputMismatchException e) {
           Clearscreen();
           sc.nextLine();
           CuteError();
       }
   }
   
   public static void Start() throws InterruptedException {
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println("\t\t\t\t\t╔══════════════════════════════════════════════════════════╗");
       System.out.println("\t\t\t\t\t║                                                          ║");
       System.out.println(PURPLE + "\t\t\t\t\t║         ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★         ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║           ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★           ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║             ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★             ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║               ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★               ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║                 ★━━━━━━━━━━━━━━━━━━━━━━━━━★                 ║" + RESET);
       System.out.println("\t\t\t\t\t║                                                          ║");
       System.out.println(PINK + "\t\t\t\t\t║                      ∧,,,∧                              ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                    ( ̳• · • ̳)                            ║" + RESET);
       System.out.println(PINK + "\t\t\t\t\t║                    /    づ♡                             ║" + RESET);
       System.out.println("\t\t\t\t\t║                                                          ║");
       System.out.println(CYAN + BOLD + "\t\t\t\t\t║                 ✨ FEATURES MENU ✨                      ║" + RESET);
       System.out.println("\t\t\t\t\t║                                                          ║");
       System.out.println(YELLOW + "\t\t\t\t\t║              [1] ✨ Calculator                          ║" + RESET);
       System.out.println(YELLOW + "\t\t\t\t\t║              [2] 📏 Conversion                          ║" + RESET);
       System.out.println(YELLOW + "\t\t\t\t\t║              [3] 🔢 Odd & Even                          ║" + RESET);
       System.out.println(YELLOW + "\t\t\t\t\t║              [4] ⭕ Circle Magic                        ║" + RESET);
       System.out.println(YELLOW + "\t\t\t\t\t║              [5] 🔙 Back                               ║" + RESET);
       System.out.println(YELLOW + "\t\t\t\t\t║              [6] 👋 Exit                               ║" + RESET);
       System.out.println("\t\t\t\t\t║                                                          ║");
       System.out.println(PURPLE + "\t\t\t\t\t║                 ★━━━━━━━━━━━━━━━━━━━━━━━━━★                 ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║               ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★               ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║             ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★             ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║           ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★           ║" + RESET);
       System.out.println(PURPLE + "\t\t\t\t\t║         ★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★         ║" + RESET);
       System.out.println("\t\t\t\t\t║                                                          ║");
       System.out.println("\t\t\t\t\t╚══════════════════════════════════════════════════════════╝");
       System.out.print("\n" + WHITE + BOLD + "\t\t\t\t\t\tChoose your option: " + RESET);
       
       try {
           option = (int) getUserInput1();
           switch (option) {
               case 1:
                   Clearscreen();
                   Calculator();
                   break;
               case 2:
                   Clearscreen();
                   Conversion();
                   break;
               case 3:
                   Clearscreen();
                   OddEven();
                   break;
               case 4:
                   Clearscreen();
                   CircleCalc();
                   break;
               case 5:
                   Clearscreen();
                   StartScreen();
                   break;
               case 6:
                   Clearscreen();
                   Exit();
                   break;
               default:
                   Clearscreen();
                   CuteError();
                   break;
           }
       } catch (InputMismatchException e) {
           Clearscreen();
           sc.nextLine();
           CuteError();
       }
   }
   
   public static void loading() throws InterruptedException {
       String[] faces = {"(◡ ω ◡)", "( ◡ ω ◡ )", "( ◡  ω  ◡ )", "( ◡ ω ◡ )", "(◡ ω ◡)"};
       
       for (int cycle = 0; cycle < 3; cycle++) {
           for (int frame = 1; frame <= 10; frame++) {
               Clearscreen();
               System.out.println("\n\n\n");
               System.out.println(PINK + "\t\t\t\t╔═════════════════════════════════════════════════════════╗");
               System.out.println(PINK + "\t\t\t\t║                                                                    ║");
               System.out.println(PINK + BOLD + "\t\t\t\t║               ♡✿.｡.:* KAWAII LOADING SCREEN *.:｡.✿♡                ║" + RESET);
               System.out.println(PINK +  "\t\t\t\t║                                                                    ║");
               System.out.println(PINK + "\t\t\t\t║                              ／l、                                 ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                            （ﾟ､ ｡ ７                               ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                              l  ~ヽ                                ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                              じしf_,)ノ                            ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                                                                    ║");
               System.out.println(YELLOW + "\t\t\t\t║                             " + faces[frame % faces.length] + "                            ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                                                                    ║");
               System.out.print(GREEN + "\t\t\t\t║    LOADING: [");
               for (int i = 0; i < 20; i++) {
                   if (i < (frame * 2)) {
                       System.out.print("♥");
                   } else {
                       System.out.print("♡");
                   }
               }
               System.out.println("] " + (frame * 10) + "% ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                                                                    ║");
               System.out.print(PURPLE + BOLD + "\t\t\t\t║                           Loading");
               for (int i = 0; i < (frame % 4); i++) {
                   System.out.print(".");
               }
               for (int i = 0; i < (3 - (frame % 4)); i++) {
                   System.out.print(" ");
               }
               System.out.println("                     	     ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                                                                    ║");
               String[] messages = {
                   "Preparing kawaii interface...",
                   "Loading cute animations...",
                   "Setting up pastel colors...",
                   "Initializing heart decorations...",
                   "Activating kawaii mode...",
                   "Loading adorable features...",
                   "Preparing cute calculations...",
                   "Setting up magical circles...",
                   "Loading conversion magic...",
                   "Almost ready! ♡"
               };
               System.out.println(YELLOW + "\t\t\t\t║           	" + messages[frame - 1] + "                       ║" + RESET);
               System.out.println(PINK + "\t\t\t\t║                                                                    ║");
               System.out.println(PINK + "\t\t\t\t╚═════════════════════════════════════════════════════════╝");
               System.out.println(PINK + "\t\t\t\t\t\t    ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡" + RESET);
               Thread.sleep(300);
           }
       }
       
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println(GREEN + BOLD + "\t\t\t\t╔════════════════════════════════════════════════════════════════════╗" + RESET);
       System.out.println(GREEN + "\t\t\t\t║                                                                    ║" + RESET);
       System.out.println(GREEN + BOLD + "\t\t\t\t║                        ✨ LOADING COMPLETE! ✨                     ║" + RESET);
       System.out.println(GREEN + "\t\t\t\t║                                                                    ║" + RESET);
       System.out.println(PINK + "\t\t\t\t║                             ∧＿∧                                   ║" + RESET);
       System.out.println(PINK + "\t\t\t\t║                           (｡･ω･｡)ﾉ♡                                ║" + RESET);
       System.out.println(PINK + "\t\t\t\t║                           /    づ                                  ║" + RESET);
       System.out.println(GREEN + "\t\t\t\t║                                                                    ║" + RESET);
       System.out.println(YELLOW + "\t\t\t\t║                    Welcome to Kawaii Menu System!                  ║" + RESET);
       System.out.println(GREEN + "\t\t\t\t║                                                                    ║" + RESET);
       System.out.println(GREEN + "\t\t\t\t╚════════════════════════════════════════════════════════════════════╝" + RESET);
       Thread.sleep(1500);
   }
   
   public static void Aboutus() throws InterruptedException {
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println(GREEN + "\t\t\t╔═══════════════════════════════════════════════════╗");
       System.out.println(GREEN + "\t\t\t║                                                             ║");
       System.out.println(CYAN + "\t\t\t║           ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡            ║" + RESET);
       System.out.println(CYAN + "\t\t\t║             ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡               ║" + RESET);
       System.out.println(CYAN + "\t\t\t║               ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡                 ║" + RESET);
       System.out.println(CYAN + "\t\t\t║                 ♡_♡_♡_♡_♡_♡_♡_♡_♡_♡_♡                    ║" + RESET);
       System.out.println(CYAN + "\t\t\t║                   ♡_♡_♡_♡_♡_♡_♡_♡_♡                      ║" + RESET);
       System.out.println(GREEN + "\t\t\t║                                                             ║");
       System.out.println(PINK + "\t\t\t║                           ∧＿∧                              ║" + RESET);
       System.out.println(PINK + "\t\t\t║                          (｡･ω･｡)                            ║" + RESET);
       System.out.println(PINK + "\t\t\t║                          /    づ♡                           ║" + RESET);
       System.out.println(GREEN + "\t\t\t║                                                             ║");
       System.out.println(YELLOW + BOLD + "\t\t\t║                      💖 ABOUT US 💖                         ║" + RESET);
       System.out.println(GREEN + "\t\t\t║                                                             ║");
       System.out.println(GREEN + "\t\t\t║                  Menu Drive System Application              ║" + RESET);
       System.out.println(GREEN + "\t\t\t║      This Application helps you do simple equations         ║" + RESET);
       System.out.println(GREEN + "\t\t\t║           Just like a simple Scientific Calculator!         ║" + RESET);
       System.out.println(GREEN + "\t\t\t║                                                             ║");
       System.out.println(PINK + BOLD +"\t\t\t║                    ✨ Developers ✨                         ║");
       System.out.println(PINK + BOLD +"\t\t\t║                • Romay        • Apalin                      ║");
       System.out.println(PINK + BOLD +"\t\t\t║                • Villanueva   • Cualbar                     ║");
       System.out.println(PINK + BOLD +"\t\t\t║                • Bobis        • Jardio                      ║");
       System.out.println(PINK + BOLD +"\t\t\t║                • Alcaraz                                    ║");
       System.out.println(GREEN + "\t\t\t║                                                             ║");
       System.out.println(PINK + "\t\t\t║                 [1] Back ♡    [2] Exit ♡                   ║" + RESET);
       System.out.println("\t\t\t║                                                             ║");
       System.out.println("\t\t\t╚═══════════════════════════════════════════════════╝");
       System.out.print("\n" + WHITE + BOLD + "\t\t\t\tChoose your option: " + RESET);
       
       try {
           option = (int) getUserInput1();
           switch (option) {
               case 1:
                   Clearscreen();
                   StartScreen();
                   break;
               case 2:
                   Exit();
                   break;
               default:
                   Clearscreen();
                   CuteError();
                   break;
           }
       } catch (InputMismatchException e) {
           Clearscreen();
           sc.nextLine();
           CuteError();
       }
   }
   
   public static void Calculator() throws InterruptedException {
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println("\t\t\t╔══════════════════════════════════════════════════════════╗");
       System.out.println(GREEN + "\t\t\t║          ✨_✨_✨_✨_✨_✨_✨_✨_✨_✨_✨_✨_✨_✨        ║" + RESET);
       System.out.println(GREEN + "\t\t\t║            ✨_✨_✨_✨_✨_✨_✨_✨_✨_✨_✨_✨            ║" + RESET);
       System.out.println(GREEN + "\t\t\t║              ✨_✨_✨_✨_✨_✨_✨_✨_✨_✨              ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println(CYAN + "\t\t\t║                     (='ω'=)                              ║" + RESET);
       System.out.println(CYAN + "\t\t\t║                     (,(\")(\")♡                            ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println(YELLOW + BOLD + "\t\t\t║                 ✨ CALCULATOR ✨                        ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println(PINK + "\t\t\t║              [1] ➕ Addition                            ║" + RESET);
       System.out.println(PINK + "\t\t\t║              [2] ➖ Subtraction                         ║" + RESET);
       System.out.println(PINK + "\t\t\t║              [3] ✖️  Multiplication                     ║" + RESET);
       System.out.println(PINK + "\t\t\t║              [4] ➗ Division                            ║" + RESET);
       System.out.println(PINK + "\t\t\t║              [5] 🔙 Back                               ║" + RESET);
       System.out.println(PINK + "\t\t\t║              [6] 👋 Exit                               ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println("\t\t\t╚══════════════════════════════════════════════════════════╝");
       System.out.print("\n" + WHITE + BOLD + "\t\t\t\tChoose your option: " + RESET);
       
       try {
           option = (int) getUserInput1();
           switch (option) {
               case 1:
                   Clearscreen();
                   performOperation("Addition", "➕", (a, b) -> a + b);
                   break;
               case 2:
                   Clearscreen();
                   performOperation("Subtraction", "➖", (a, b) -> a - b);
                   break;
               case 3:
                   Clearscreen();
                   performOperation("Multiplication", "✖️", (a, b) -> a * b);
                   break;
               case 4:
                   Clearscreen();
                   division();
                   break;
               case 5:
                   Clearscreen();
                   Start();
                   break;
               case 6:
                   Clearscreen();
                   Exit();
                   break;
               default:
                   Clearscreen();
                   CuteError();
                   break;
           }
       } catch (InputMismatchException e) {
           Clearscreen();
           sc.nextLine();
           CuteError();
       }
   }
   
   interface MathOp {
       double calc(double a, double b);
   }
   
   public static void performOperation(String name, String symbol, MathOp op) throws InterruptedException {
       System.out.println("\n\n");
       System.out.println(YELLOW + BOLD + "\t\t\t\t\t✿ " + name + " ✿" + RESET);
       System.out.println();
       try {
           System.out.print(CYAN + "\t\t\t\t\tnum1: " + RESET);
           num1 = getUserInput();
           System.out.print(CYAN + "\t\t\t\t\tnum2: " + RESET);
           num2 = getUserInput();
           result = op.calc(num1, num2);
           System.out.println();
           System.out.println(GREEN + "\t\t\t\t" + String.format("%.2f %s %.2f = %.2f ♡", num1, symbol, num2, result) + RESET);
           System.out.println();
           System.out.println(PINK + "\t\t\t\t\t[1] Back ♡  [2] Exit ♡" + RESET);
           option = (int) getUserInput1();
           if (option == 1) {
               Clearscreen();
               Start();
           } else if (option == 2) {
               Exit();
           } else {
               CuteError();
           }
       } catch (Exception e) {
           CuteError();
       }
   }
   
   public static void division() throws InterruptedException {
       System.out.println("\n\n");
       System.out.println(YELLOW + BOLD + "\t\t\t\t\t✿ Division ✿" + RESET);
       System.out.println();
       try {
           System.out.print(CYAN + "\t\t\t\t\tnum1: " + RESET);
           num1 = getUserInput();
           System.out.print(CYAN + "\t\t\t\t\tnum2: " + RESET);
           num2 = getUserInput();
           if (num2 == 0) {
               System.out.println(PINK + "\t\t\t\tCannot divide by zero! (｡•́︿•̀｡)" + RESET);
           } else {
               result = num1 / num2;
               System.out.println();
               System.out.println(GREEN + "\t\t\t\t" + String.format("%.2f ➗ %.2f = %.2f ♡", num1, num2, result) + RESET);
           }
           System.out.println();
           System.out.println(PINK + "\t\t\t\t\t[1] Back ♡  [2] Exit ♡" + RESET);
           option = (int) getUserInput1();
           if (option == 1) {
               Clearscreen();
               Start();
           } else if (option == 2) {
               Exit();
           }
       } catch (Exception e) {
           CuteError();
       }
   }
   
   public static void Exit() throws InterruptedException {
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println("\t\t╔════════════════════════════════════════════════════════════════════╗");
       System.out.println("\t\t║                                                                    ║");
       System.out.println(PINK + BOLD + "\t\t║                      ♡･ﾟ:* BYE BYE! *:･ﾟ♡                        ║" + RESET);
       System.out.println("\t\t║                                                                    ║");
       System.out.println(CYAN + "\t\t║                              ∧＿∧                                 ║" + RESET);
       System.out.println(CYAN + "\t\t║                            (｡･ω･)ﾉﾞ                              ║" + RESET);
       System.out.println(CYAN + "\t\t║                            |    /                                 ║" + RESET);
       System.out.println(CYAN + "\t\t║                            しーJ                                  ║" + RESET);
       System.out.println("\t\t║                                                                    ║");
       System.out.println(YELLOW + "\t\t║                      Thanks for playing! ♡                        ║" + RESET);
       System.out.println(YELLOW + "\t\t║                      See you again soon!                          ║" + RESET);
       System.out.println("\t\t║                                                                    ║");
       System.out.println("\t\t╚════════════════════════════════════════════════════════════════════╝");
       Thread.sleep(2500);
       exit = true;
       System.exit(0);
   }
   
   public static void Clearscreen() {
       System.out.flush();
       for (int i = 0; i < 50; i++) {
           System.out.println();
       }
   }
   
   public static void CuteError() throws InterruptedException {
       Clearscreen();
       // Red background for error
       System.out.print(BG_RED);
       System.out.println("\n\n\n");
       System.out.println(PINK + "\t\t\t╔════════════════════════════════════════════════════╗" + RESET);
       System.out.println(BG_RED + PINK + "\t\t\t║                                                          ║" + RESET);
       System.out.println(BG_RED + WHITE + BOLD + "\t\t\t║                    (｡•́︿•̀｡) OOPSIE!                      ║" + RESET);
       System.out.println(BG_RED + PINK + "\t\t\t║                                                          ║" + RESET);
       System.out.println(BG_RED + YELLOW + "\t\t\t║                        ∧＿∧                             ║" + RESET);
       System.out.println(BG_RED + YELLOW + "\t\t\t║                      (｡•́︿•̀｡)                           ║" + RESET);
       System.out.println(BG_RED + YELLOW + "\t\t\t║                      /    づ                            ║" + RESET);
       System.out.println(BG_RED + PINK + "\t\t\t║                                                          ║" + RESET);
       System.out.println(BG_RED + WHITE + BOLD + "\t\t\t║                That's not valid! Try again ♡             ║" + RESET);
       System.out.println(BG_RED + WHITE + "\t\t\t║                                                          ║" + RESET);
       System.out.println(BG_RED + WHITE + "\t\t\t╚════════════════════════════════════════════════════╝" + RESET);
       System.out.print(RESET);
       Thread.sleep(2000);
       Clearscreen();
       StartScreen();
   }
   
   public static void Conversion() throws InterruptedException {
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println("\t\t\t╔══════════════════════════════════════════════════════════╗");
       System.out.println(PURPLE + "\t\t\t║          📏_📏_📏_📏_📏_📏_📏_📏_📏_📏_📏_📏          ║" + RESET);
       System.out.println(PURPLE + "\t\t\t║            📏_📏_📏_📏_📏_📏_📏_📏_📏_📏            ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println(PINK + "\t\t\t║                         ∧∧                              ║" + RESET);
       System.out.println(PINK + "\t\t\t║                       (  ･ω･)                           ║" + RESET);
       System.out.println(PINK + "\t\t\t║                       /    づ♡                          ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println(CYAN + BOLD + "\t\t\t║                  ✨ CONVERSION ✨                       ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println(YELLOW + "\t\t\t║                   [1] mm → cm                           ║" + RESET);
       System.out.println(YELLOW + "\t\t\t║                   [2] cm → m                            ║" + RESET);
       System.out.println(YELLOW + "\t\t\t║                   [3] m → cm                            ║" + RESET);
       System.out.println(YELLOW + "\t\t\t║                   [4] cm → mm                           ║" + RESET);
       System.out.println(YELLOW + "\t\t\t║                   [5] 🔙 Back                          ║" + RESET);
       System.out.println(YELLOW + "\t\t\t║                   [6] 👋 Exit                          ║" + RESET);
       System.out.println("\t\t\t║                                                          ║");
       System.out.println("\t\t\t╚══════════════════════════════════════════════════════════╝");
       System.out.print("\n" + WHITE + BOLD + "\t\t\t\tChoose your option: " + RESET);
       
       try {
           option = (int) getUserInput1();
           Clearscreen();
           
           String[] units = {"mm", "cm", "m", "cm"};
           String[] resUnits = {"cm", "m", "cm", "mm"};
           double[] factors = {0.1, 0.01, 100, 10};
           
           if (option >= 1 && option <= 4) {
               System.out.println("\n\n");
               System.out.print(CYAN + "\t\t\t\t\tEnter " + units[option - 1] + ": " + RESET);
               Cm = getUserInput();
               result = Cm * factors[option - 1];
               System.out.println();
               System.out.println(GREEN + "\t\t\t\t" + String.format("%.2f %s = %.2f %s ♡", Cm, units[option - 1], result, resUnits[option - 1]) + RESET);
               System.out.println();
               System.out.println(PINK + "\t\t\t\t\t[1] Back ♡  [2] Exit ♡" + RESET);
               
               int opt = (int) getUserInput1();
               if (opt == 1) Start();
               else if (opt == 2) Exit();
               else CuteError();
           } else if (option == 5) {
               Start();
           } else if (option == 6) {
               Exit();
           } else {
               CuteError();
           }
       } catch (Exception e) {
           CuteError();
       }
   }
   
   public static void OddEven() throws InterruptedException {
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println(YELLOW + BOLD + "\t\t\t\t✿ ODD & EVEN CHECKER ✿" + RESET);
       System.out.println();
       try {
           System.out.print(CYAN + "\t\t\t\t\tEnter number: " + RESET);
           int number = sc.nextInt();
           sc.nextLine();
           String res = (number % 2 == 0) ? "EVEN ✨" : "ODD ⭐";
           String color = (number % 2 == 0) ? GREEN : PINK;
           System.out.println();
           System.out.println(color + "\t\t\t\t\t" + number + " is " + res + RESET);
           System.out.println();
           System.out.println(PINK + "\t\t\t\t\t[1] Back ♡  [2] Exit ♡" + RESET);
           option = (int) getUserInput1();
           if (option == 1) {
               Clearscreen();
               Start();
           } else if (option == 2) {
               Exit();
           } else {
               CuteError();
           }
       } catch (Exception e) {
           Clearscreen();
           sc.nextLine();
           CuteError();
       }
   }
   
   public static void CircleCalc() throws InterruptedException {
       Clearscreen();
       System.out.println("\n\n\n");
       System.out.println(CYAN + "\t\t\t\t\t.-'''''-." + RESET);
       System.out.println(CYAN + "\t\t\t\t.'  " + PINK + "♡" + CYAN + "  " + PINK + "♡" + CYAN + "  '." + RESET);
       System.out.println(CYAN + "\t\t\t\t/      " + YELLOW + "r" + CYAN + "      \\" + RESET);
       System.out.println(CYAN + "\t\t\t\t|       " + PINK + "♡" + CYAN + "       |" + RESET);
       System.out.println(CYAN + "\t\t\t\t\\   " + PINK + "♡" + CYAN + "     " + PINK + "♡" + CYAN + "   /" + RESET);
       System.out.println(CYAN + "\t\t\t\t'.  " + PINK + "♡" + CYAN + "  " + PINK + "♡" + CYAN + "  .'" + RESET);
       System.out.println(CYAN + "\t\t\t\t\t'-.....-'" + RESET);
       System.out.println();
       try {
           System.out.print(CYAN + "\t\t\t\t\tEnter radius: " + RESET);
           radius = getUserInput();
           if (radius <= 0) {
               System.out.println(PINK + "\t\t\t\tRadius must be positive! ♡" + RESET);
           } else {
               result = 2 * Math.PI * radius;
               result2 = Math.PI * radius * radius;
               System.out.println();
               System.out.println(GREEN + "\t\t\t\t" + String.format("Area: %.2f ♡", result2) + RESET);
               System.out.println(GREEN + "\t\t\t\t" + String.format("Circumference: %.2f ♡", result) + RESET);
           }
           System.out.println();
           System.out.println(PINK + "\t\t\t\t\t[1] Back ♡  [2] Exit ♡" + RESET);
           option = (int) getUserInput1();
           if (option == 1) {
               Clearscreen();
               Start();
           } else if (option == 2) {
               Exit();
           } else {
               CuteError();
           }
       } catch (Exception e) {
           CuteError();
       }
   }
   
   public static double getUserInput() throws InterruptedException {
       double value = 0;
       boolean validInput = false;
       while (!validInput) {
           String input = sc.nextLine();
           if (input.isEmpty()) {
               CuteError();
               break;
           }
           try {
               value = Double.parseDouble(input);
               validInput = true;
           } catch (NumberFormatException e) {
               CuteError();
           }
       }
       return value;
   }
   
   public static double getUserInput1() throws InterruptedException {
       int value = 0;
       boolean validInput = false;
       while (!validInput) {
           String input = sc.nextLine();
           if (input.isEmpty()) {
               CuteError();
               break;
           }
           try {
               value = Integer.parseInt(input);
               validInput = true;
           } catch (NumberFormatException e) {
               CuteError();
           }
       }
       return value;
   }
}