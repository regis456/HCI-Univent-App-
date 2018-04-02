package edu.augsburg.univent.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import edu.augsburg.univent.R;

/**
 * /**
 * Supporting code for activity_artist_description.xml
 * The toolbar and inflater do not want to work for some reason.
 * @author kaleb
 */
public class ArtistDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_description);
        //Add toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Attempts to create toolbar, commented out search view because it broke it.
     * @param menu toolbar .xml file to use
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_venues_description, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView =
                (SearchView) searchItem.getActionView();

        // Configure the search info and add any event listeners...
        // Define the listener
        /*TODO Get collapsible toolbar search to work.
        MenuItem.OnActionExpandListener expandListener = new MenuItem.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // Do something when action item collapses
                return true;  // Return true to collapse action view
            }

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                // Do something when expanded
                return true;  // Return true to expand action view
            }
        };
        // Get the MenuItem for the action item
        MenuItem actionMenuItem = menu.findItem(R.id.action_search);

        // Assign the listener to that action item
        MenuItemCompat.setOnActionExpandListener(actionMenuItem, android.view.MenuItem.OnActionExpandListener);

        // Any other things you have to do when creating the options menu...
        */

        return true;
    }

    /**
     * Do stuff with items in toolbar
     * @param item action in toolbar
     * @return action for specific toolbar item
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case (R.id.action_search):
                /* TODO Have action_search open the search bar
                 * */
                return true;
            case (R.id.action_settings):
                //TODO Have action_settings open the settings activity
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
