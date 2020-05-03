package com.groceryanalytics.grocery_analytics.system;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.groceryanalytics.grocery_analytics.store.StoreInformation;
import com.groceryanalytics.grocery_analytics.store.StoreInformationRepository;
import com.groceryanalytics.grocery_analytics.store.UserRepository;
import com.groceryanalytics.grocery_analytics.store.AnalyticsRepository;
import com.groceryanalytics.grocery_analytics.store.HourCount;
import com.groceryanalytics.grocery_analytics.store.HourCountRepository;

import com.groceryanalytics.grocery_analytics.store.WeekCount;
import com.groceryanalytics.grocery_analytics.store.WeekCountRepository;

import com.groceryanalytics.grocery_analytics.store.MonthCount;
import com.groceryanalytics.grocery_analytics.store.MonthCountRepository;

import com.groceryanalytics.grocery_analytics.store.Items;
import com.groceryanalytics.grocery_analytics.store.ItemsRepository;

@Controller
public class FragmentController {

    //NOTE: whenever you create a new repository, it MUST have a "@Autowired" above it (it only applies
    // to the first field below it)
    @Autowired
    private StoreInformationRepository storeRepository;

    @Autowired
    private HourCountRepository hourRepository;

    //@Autowired
    //private WeekCountRepository weekRepository;
    //@Autowired
    //private MonthCountRepository monthRepository;
    @Autowired
    private ItemsRepository itemsRepository;
    @Autowired
    private AnalyticsRepository analyticsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public String getHome(Model model) {
        model.addAttribute("storeoverview", storeRepository.findAll());
        return "home.html";
    }

    @GetMapping("items")
    public String getItems() {
        return "items.html";
    }

    @RequestMapping(value = "/hours/1", method = RequestMethod.GET)
    public String getHoursID1(Model model) {
        model.addAttribute("store", storeRepository.findBySid(1));
        model.addAttribute("first", storeRepository.findBySid(1));
        model.addAttribute("second", storeRepository.findBySid(2));
        model.addAttribute("third", storeRepository.findBySid(3));
        model.addAttribute("hours", hourRepository.findBySid(1));
        return "hours.html";
    }

    @RequestMapping(value = "/hours/2", method = RequestMethod.GET)
    public String getHoursID2(Model model) {
        model.addAttribute("store", storeRepository.findBySid(2));
        model.addAttribute("first", storeRepository.findBySid(1));
        model.addAttribute("second", storeRepository.findBySid(2));
        model.addAttribute("third", storeRepository.findBySid(3));
        model.addAttribute("hours", hourRepository.findBySid(2));
        return "hours.html";
    }

    @RequestMapping(value = "/hours/3", method = RequestMethod.GET)
    public String getHoursID3(Model model) {
        model.addAttribute("store", storeRepository.findBySid(3));
        model.addAttribute("first", storeRepository.findBySid(1));
        model.addAttribute("second", storeRepository.findBySid(2));
        model.addAttribute("third", storeRepository.findBySid(3));
        model.addAttribute("hours", hourRepository.findBySid(3));
        return "hours.html";
    }
    @RequestMapping(value = "/store", method = RequestMethod.GET)
    public String getStore(Model model) {
        model.addAttribute("analytics", analyticsRepository.findAll());
        return "store.html";
    }

    @RequestMapping(value = "/storeinformation", method = RequestMethod.GET) 
    public String getStoreInformation(Model model) {
        model.addAttribute("storeinfo", storeRepository.findAll());
        return "storeinfo.html";
    }

    /*@GetMapping("all")
    public @ResponseBody Iterable<StoreInformation> getAllStores()
    {
        return storeRepository.findAll();
    }*/

    @GetMapping("all")
    // returns a formatted string where the toString method is in each class (ie HourCount, WeekCount, etc.)
    public @ResponseBody String getAll()
    {
        //i used this to test for something other than id
        //StoreInformation test = storeRepository.findByName("Safeway");
        //return test.toString();
        
        //Creates a list of the records that have store id = 1
        //List<HourCount> hour = hourRepository.findBySid(1);
        //String result = "";
        //Goes through list and converts each HourCount object to string in format specified in toString in HourCount
        //for (HourCount element : hour)
        //    result = result + element.toString() + "\n";
        //return result;

        //Creates a list of the records that have store id = 2
        //List<WeekCount> week = weekRepository.findBySid(2);
        //String result = "";
        //Goes through list and converts each HourCount object to string in format specified in toString in HourCount
        //for (WeekCount element : week)
        //    result = result + element.toString() + "\n";
        //return result;

        //Creates a list of the records that have store id = 3
        //List<MonthCount> month = monthRepository.findBySid(3);
        //String result = "";
        //Goes through list and converts each HourCount object to string in format specified in toString in HourCount
        //for (MonthCount element : month)
        //    result = result + element.toString() + "\n";
        //return result;

        //Creates a list of the records that have store id = 4
        List<Items> items = itemsRepository.findBySid(4);
        String result = "";
        //Goes through list and converts each HourCount object to string in format specified in toString in HourCount
        for (Items element : items)
            result = result + element.toString() + "\n";
        return result;
        
    }
}