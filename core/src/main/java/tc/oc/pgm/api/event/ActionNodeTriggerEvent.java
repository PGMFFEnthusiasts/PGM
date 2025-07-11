package tc.oc.pgm.api.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ActionNodeTriggerEvent extends Event {
  public final String nodeId;
  public final Object scope;

  public ActionNodeTriggerEvent(final String nodeId, Object scope) {
    this.nodeId = nodeId;
    this.scope = scope;
  }

  // Bukkit event junk
  public static final HandlerList handlers = new HandlerList();

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }
}
