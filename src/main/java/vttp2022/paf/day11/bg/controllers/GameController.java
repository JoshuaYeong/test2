// package vttp2022.paf.day11.bg.controllers;

// import java.lang.StackWalker.Option;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// import vttp2022.paf.day11.bg.models.Game;
// import vttp2022.paf.day11.bg.repositories.GameRepository;

// @Controller
// @RequestMapping(path="/game")
// public class GameController {

//     @Autowired
//     private GameRepository gameRepo;

//     @GetMapping
//     public String gameSearch(@RequestParam(name="gid") Integer gameId, Model model)
//     {
//         Optional<Game> opt = gameRepo.getGameByGid(gameId);
//         if (opt.isPresent()) opt.get();
//         model.addAttribute("games", gameId);
//         return "game";
        
//     }
// }
